package com.example.aves;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class aves6 extends AppCompatActivity {

    private Spinner spinner;
    private ImageButton btnsonido;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves6);

        spinner = findViewById(R.id.spinnerave6);
        btnsonido = findViewById(R.id.imgave6);

        String[] opciones = {"Seleccionar ave","Bolborhynchus ferrugineifrons","Chlorochrysa nitidissima",
                "Cistothorus apolinari", "Coeligena orina",
                "Doliornis remseni", /*"Grallaria urraoensis",*/
                "Lipaugus weberi", "Odontophorus strophium", "Rallus semiplumbeus"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        btnsonido = (ImageButton) findViewById(R.id.imgave6);
        mp = MediaPlayer.create(this, R.raw.grallariaurraoensis);
        btnsonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

            }
        });
    }
    public void pausarave6(View view){

        mp.stop();
    }

    public void buscar6(View view){

        String s = spinner.getSelectedItem().toString();
        if (s.equals("Bolborhynchus ferrugineifrons")){
            Intent intent= new Intent(this, aves1.class);
            startActivity(intent);
        }
        if (s.equals("Chlorochrysa nitidissima")){
            Intent intent = new Intent(this, aves2.class);
            startActivity(intent);
        }
        if(s.equals("Cistothorus apolinari")){
            Intent intent=new Intent(this, aves3.class);
            startActivity(intent);
        }
        if(s.equals("Coeligena orina")){
            Intent intent= new Intent(this, aves4.class);
            startActivity(intent);
        }
        if(s.equals("Doliornis remseni")){
            Intent intent = new Intent(this, aves5.class);
            startActivity(intent);
        }

        if(s.equals("Lipaugus weberi")){
            Intent intent = new Intent(this, aves7.class);
            startActivity(intent);
        }
        if(s.equals("Odontophorus strophium")){
            Intent intent = new Intent(this, aves8.class);
            startActivity(intent);
        }
        if(s.equals("Rallus semiplumbeus")){
            Intent intent = new Intent(this, aves9.class);
            startActivity(intent);
        }
    }
}