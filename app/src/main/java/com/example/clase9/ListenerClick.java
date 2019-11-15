package com.example.clase9;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ListenerClick implements DialogInterface.OnClickListener {
    private View view;

    public ListenerClick(View view){
        this.view = view;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int witch) {
        switch(witch){
            case AlertDialog.BUTTON_POSITIVE:
                EditText editText = this.view.findViewById(R.id.editText);
                String texto = editText.getText().toString();
                Log.d("positive", "positive " + witch + " \ntexto: " + texto);
                break;
            case AlertDialog.BUTTON_NEGATIVE:
                Log.d("negative", "negative " + witch);
                break;
            default:
                Log.d("neutral", "neutral " + witch);

        }
    }
}
