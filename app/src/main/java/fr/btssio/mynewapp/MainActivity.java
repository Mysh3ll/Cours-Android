package fr.btssio.mynewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Méthode onCreate du cycle de vie de l'activité
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Récupération de la vue/présentation de notre activité
        setContentView(R.layout.activity_main);
    }

    //Méthode appelée par le clique du bouton
    public void calculIMC(View v) {

        //Récupération de nos différents éléments depuis notre Layout
        EditText etTaille = (EditText) findViewById(R.id.taille);
        EditText etPoids = (EditText) findViewById(R.id.poids);
        TextView tvImc = (TextView) findViewById(R.id.IMC);

        //Mémorisation des valeurs et conversion en format double
        double taille = Double.parseDouble(etTaille.getText().toString().trim()) / 100;
        double poids = Double.parseDouble(etPoids.getText().toString().trim());

        //Calcul du résultat final
        double IMC = poids / (taille * taille);

        //Affichage du résultat
        tvImc.setText(String.format("%f", IMC));
    }
}
