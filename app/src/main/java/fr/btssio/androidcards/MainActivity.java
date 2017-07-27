package fr.btssio.androidcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fr.btssio.androidcards.Adapter.SystemeAndroidAdapter;

public class MainActivity extends AppCompatActivity {

    /*
    Déclaration des instances globales
    */
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation des SystemeAndroid
        List<SystemeAndroid> items = new ArrayList();

        items.add(new SystemeAndroid(R.drawable.cupcake, "Cupcake", "1.5"));
        items.add(new SystemeAndroid(R.drawable.donut, "Donut", "1.6"));
        items.add(new SystemeAndroid(R.drawable.eclair, "Eclair", "2.0-2.1"));
        items.add(new SystemeAndroid(R.drawable.froyo, "Froyo", "2.2-2.2.3"));
        items.add(new SystemeAndroid(R.drawable.gingerbread, "Gingerbread", "2.3-2.3.7"));
        items.add(new SystemeAndroid(R.drawable.honeycomb, "Honeycomb", "3.0-3.2.6"));
        items.add(new SystemeAndroid(R.drawable.ics, "Ice Cream Sandwich", "4.0-4.0.4"));
        items.add(new SystemeAndroid(R.drawable.jellybean, "JellyBean", "4.1-4.3.1"));
        items.add(new SystemeAndroid(R.drawable.kitkat, "Kitkat", "4.4-4.4.4"));
        items.add(new SystemeAndroid(R.drawable.lollipop, "Lollipop", "5.0-5.1.1"));
        items.add(new SystemeAndroid(R.drawable.marsh, "Marshmallow", "6.0-6.0.1"));

        //Obtention du Recycler
        recycler = (RecyclerView) findViewById(R.id.recycleur);
        recycler.setHasFixedSize(true);

        //Utilisation du LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        //Création d'un nouveau adapter
        adapter = new SystemeAndroidAdapter(items);
        recycler.setAdapter(adapter);
    }

}
