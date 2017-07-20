package fr.btssio.mynewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Méthode onCreate du cycle de vie de l'activité
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Récupération de la vue/présentation de notre activité
        setContentView(R.layout.activity_main);
    }
}
