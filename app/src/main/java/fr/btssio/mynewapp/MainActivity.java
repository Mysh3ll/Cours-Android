package fr.btssio.mynewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Méthode onCreate du cycle de vie de l'activité
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Récupération de la vue/présentation de notre activité
        setContentView(R.layout.activity_main);
    }

    //Appel de notre méthode "onClick" du bouton provenant de notre Layout
    public void actionBouton (View v) {

        //Récupération de notre élément TextView depuis notre Layout
        TextView tv = (TextView) findViewById(R.id.message);

        //Changement de la valeur de notre texte pour l'élément TextView
        tv.setText("Le dev c'est cool !");
    }
}
