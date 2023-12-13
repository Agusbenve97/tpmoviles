package com.example.tp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button perrosButton = findViewById(R.id.buttonPerros);
        Button gatosButton = findViewById(R.id.buttonGatos);
        Button perdidosButton = findViewById(R.id.buttonPerdidos);
        Button antesDeAdoptarButton = findViewById(R.id.buttonAntesDeAdoptar);

        setButtonClickListener(perrosButton, "https://concienciaanimalmdq.wordpress.com/category/perros/");
        setButtonClickListener(gatosButton, "https://concienciaanimalmdq.wordpress.com/category/gatos/");
        setButtonClickListener(perdidosButton, "https://concienciaanimalmdq.wordpress.com/category/perdidos/");
        setButtonClickListener(antesDeAdoptarButton, "https://concienciaanimalmdq.wordpress.com/jornadas/");
    }

    private void setButtonClickListener(Button button, final String url) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    showToast("No hay aplicaciones para abrir el link");
                }
            }
        });
    }

    private void showToast(String message) {
        //cod para mostrar la app
    }
}

