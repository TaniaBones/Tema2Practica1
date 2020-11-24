package com.example.tema2practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //aquí vamos a generar el toast personalizado
    protected void showToast1(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toastPersonalizado));

        Toast toast=new Toast((getApplicationContext()));
        //en la siguiente línea podemos ver donde decido mostrar el Toast
        toast.setGravity(Gravity.TOP,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    public void ClicBoton(View view){
        Intent intent=new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        showToast1();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

}