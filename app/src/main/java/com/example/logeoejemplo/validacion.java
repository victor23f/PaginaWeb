package com.example.logeoejemplo;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class validacion extends MainActivity{
    private String usuario,contrasena;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validar_main);
    }

    public void volver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void validar(View view){
        datos=getIntent().getExtras();
        usuario = datos.getString("us");
        contrasena = datos.getString("con");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (usuario.equals("victor")&&contrasena.equals("1234")){
            builder.setTitle("Validacion");
            builder.setMessage("Login correcto!");
            builder.setPositiveButton("Aceptar",null);
        }else{
            builder.setTitle("Validacion");
            builder.setMessage("Login incorrecto");
            builder.setPositiveButton("Aceptar",null);
        }
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
