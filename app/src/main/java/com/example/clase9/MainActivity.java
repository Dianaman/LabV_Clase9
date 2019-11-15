package com.example.clase9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialogo dialogo = new Dialogo();
        dialogo.show(this.getSupportFragmentManager(), "main");
    }
}
