package com.example.clase9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.fragment.app.DialogFragment;

public class Dialogo extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle b){
        AlertDialog.Builder build = new AlertDialog.Builder(getActivity());
        //build.setTitle("Titulo");
        //build.setMessage("Mensaje");

        View v = LayoutInflater.from(getContext()).inflate(R.layout.popup, null);
        build.setView(v);

        ListenerClick listener = new ListenerClick(v);

        build.setPositiveButton("Ok", listener);
        build.setNegativeButton("Cancel", listener);
        build.setNeutralButton("Ajem", listener);

        AlertDialog ad = build.create();
        return ad;
    }
}
