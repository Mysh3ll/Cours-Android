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

    //Appel de notre méthode "onClick" du bouton provenant de notre Layout
    public void actionBouton (View v) {

        //Récupération de notre élément TextView depuis notre Layout
        TextView tv = (TextView) findViewById(R.id.message);

        //Récupération de notre élément EditText depuis notre Layout
        EditText et = (EditText) findViewById(R.id.messageUtilisateur);

        //Texte saisi dans l'élément EditText
        String message = et.getText().toString().trim();

        //Changement de la valeur de l'élément TextView par notre message
        tv.setText(message);
    }
}
