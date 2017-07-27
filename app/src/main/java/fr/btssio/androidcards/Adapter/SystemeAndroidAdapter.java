package fr.btssio.androidcards.Adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.btssio.androidcards.R;
import fr.btssio.androidcards.SystemeAndroid;

public class SystemeAndroidAdapter extends RecyclerView.Adapter<SystemeAndroidAdapter.SystemeAndroidViewHolder> {

    //Liste qui contiendra nos différents objets de type SystemeAndroid
    private List<SystemeAndroid> items;

    public static class SystemeAndroidViewHolder extends RecyclerView.ViewHolder {
        // Éléments respectifs d'un item
        public ImageView image;
        public TextView nom;
        public TextView version;

        public SystemeAndroidViewHolder(View v) {
            super(v);
            image = (ImageView) v.findViewById(R.id.image);
            nom = (TextView) v.findViewById(R.id.nom);
            version = (TextView) v.findViewById(R.id.version);
        }
    }

    public SystemeAndroidAdapter(List<SystemeAndroid> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public SystemeAndroidViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.android_card, viewGroup, false);
        return new SystemeAndroidViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SystemeAndroidViewHolder viewHolder, int i) {
        viewHolder.image.setImageResource(items.get(i).getImage());
        viewHolder.nom.setText(items.get(i).getNom());
        viewHolder.version.setText("Version:" + String.valueOf(items.get(i).getVersion()));
    }

}