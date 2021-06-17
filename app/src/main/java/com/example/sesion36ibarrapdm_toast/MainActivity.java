package com.example.sesion36ibarrapdm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast1, btnToast2, btnToast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast1 = (Button) findViewById(R.id.btnToast1);
        btnToast2 = (Button) findViewById(R.id.btnToast2);
        btnToast3 = (Button) findViewById(R.id.btnToast3);

    }

    public void toastPersonalizado1(View view) {

        //variables de entrada
        Context context = getApplicationContext();
        CharSequence mensaje = "MENSAJE EMERGENTE \n\nTOAST PERSONALIZADO \n\nIBARRA";
        int duration = Toast.LENGTH_LONG;

        //Integracion de variables objeto a objeto TOAST
        Toast toastPersonalizado1 = Toast.makeText(context,mensaje,duration);

        toastPersonalizado1.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toastPersonalizado1.show();

    }

    public void toastPersonalizado2(View view) {

        //variables de entrada
        Context context = getApplicationContext();
        CharSequence mensaje = "MENSAJE EMERGENTE \n\nTOAST PERSONALIZADO \n\nIBARRA";
        int duration = Toast.LENGTH_LONG;

        //Integracion de variables objeto a objeto TOAST
        Toast toastPersonalizado2 = Toast.makeText(context,mensaje,duration);

        toastPersonalizado2.setGravity(Gravity.CENTER_VERTICAL,100,200);
        toastPersonalizado2.show();

    }

    public void toastPersonalizado3(View view) {

        //variables de entrada
        Context context = getApplicationContext();
        CharSequence mensaje = "MENSAJE EMERGENTE \n\nTOAST PERSONALIZADO \n\nIBARRA";
        int duration = Toast.LENGTH_LONG;

        //Integracion de variables objeto a objeto TOAST
        Toast toastPersonalizado3 = Toast.makeText(context,mensaje,duration);

        toastPersonalizado3.setGravity(Gravity.CENTER_VERTICAL,-100,50);
        toastPersonalizado3.show();

    }

    public void toast2Personalizado(View view) {

        //Layoutinflater ejecucion o compilacion
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2,null);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);

        //Llamada, invocacion a elementos
        toast.setView(layout);
        toast.show();
    }

    public void toast3Personalizado(View view) {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast3,null);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);

        //Llamada, invocacion a elementos
        toast.setView(layout);
        toast.show();

    }

}