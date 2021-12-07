package br.com.rodrigo.uber.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import br.com.rodrigo.uber.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

    }
}
