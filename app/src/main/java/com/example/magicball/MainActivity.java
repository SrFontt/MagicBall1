package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ballI;
    private TextView respuesta;

    private String[] respuestaArray={"¿Por qué cuando una persona tiene la razón hay que dársela? Si ya la tiene",
    "¿Por qué Goofy es capaz de caminar sobre sus dos pies y Pluto va a cuatro patas?", " ¿Por qué los Picapiedra festejaban la Navidad si vivían antes de Cristo?",
    "¿Por qué llamamos “comida” a la comida, incluso antes de comerla?", " ¿Por qué en la guantera del coche no hay guantes?",
    "Si cárcel y prisión son sinónimos, ¿por qué no lo son carcelero y prisionero?", "Si una palabra estuviese mal escrita en el diccionario, ¿cómo lo sabríamos?",
    "¿Hasta dónde se lavan la cara los calvos?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballI = findViewById(R.id.boton);
        respuesta = findViewById(R.id.respuesta);

        ballI.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Buscando tu destino", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v){
        //Creación de método de respuesta aleatoria

        switch (v.getId()){
            case R.id.boton:
                 int random = new Random().nextInt(respuestaArray.length);
                 respuesta.setText(respuestaArray[random]);

                 break;
        }


    }
}