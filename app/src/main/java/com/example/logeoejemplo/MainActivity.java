package com.example.logeoejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView miWeb = (WebView) findViewById(R.id.pagina);
        miWeb.loadUrl("https://www.google.com");

    }
    public void presionarBoton(View view){
        String usuario,contrasena;
        Intent intent = new Intent(this, validacion.class);

        EditText v1 = (EditText)findViewById(R.id.nombreIntroducido);
        usuario = v1.getText().toString();
        EditText v2 = (EditText)findViewById(R.id.contrasenaIntroducida);
        contrasena = v2.getText().toString();
        intent.putExtra("us",usuario);
        intent.putExtra("con",contrasena);
        startActivity(intent);


    }
    public void paginaWeb(View vista){
        Uri webpage = Uri.parse("https://www.google.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);

    }
}