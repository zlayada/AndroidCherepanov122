package com.netology.androidcherepanov122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = (Button) findViewById(R.id.buttonNext);
        btnNext.setOnClickListener(this);

        Button btnBack = (Button) findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(this);

        TextView textViewAdress = findViewById(R.id.textAddress);
        String textOutAdress = textViewAdress.getText().toString(); // берем текст и приводим к типу String

        // Получаем случайное число
        Random random = new Random();
        int numberScreen = random.nextInt(100) + 1;

        // Составляем сообщение
        String s = getString(R.string.address) + numberScreen;

        // Выводим сообщение в textView
        textViewAdress.setText(s);

    }

    @Override
    public void onClick(View view) {



        switch (view.getId()) {
            case R.id.buttonNext:
                Intent intentNext = new Intent(this, MainActivity.class);
                startActivity(intentNext);

                break;

            case R.id.buttonBack:
                //Intent intentBack = new Intent(this, MainActivity.class);
                //startActivity(intentBack);
                finish();

                break;

            default:
                break;

        }





    }

}
