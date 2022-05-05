package br.ufmg.coltec.e03_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.ufmg.coltec.e03_adapters.Place;

public class PlaceAdapter extends BaseAdapter {
    private List<Place> places;
    private Context context;

    public PlaceAdapter(Context context){
        this.places = new ArrayList<>();
        this.context = context;

        //Iniciacao Lugares
        Place mineirao = new Place("Mineirão", R.drawable.mineirao, 1.1, 5, "Estádio de Futebol\nToca 3");
        Place cristo = new Place("Cristo Redentor", R.drawable.cristo, 350.0, 4, "Uma das maravilhas do mundo\nRio de Janeiro-RJ");
        Place igrejinha = new Place("Igrejinha da Pampulha", R.drawable.igrejinha, 2.3, 3, "Patrimonio de BH");
        Place ufmg = new Place("UFMG",R.drawable.ufmg , 0.1, 5, "Maior universidade de Minas Gerais");
        Place casa = new Place("Minha casa", R.drawable.casa, 4.6, 5, "O lugar onde eu moro");
        Place praca = new Place("Praça da Liberdade", R.drawable.pliberdade, 7.1, 2, "Uma praça qualquer!");
        Place parque = new Place("Parque Guanabara", R.drawable.guanabara, 2.1, 4, "Parque de diversões");
        Place museu = new Place("Museu Oscar Niemeyer", R.drawable.museu, 996.2, 1, "Museu de Arte\nCuritiba");

        //Inserção
        this.places.add(mineirao);
        this.places.add(cristo);
        this.places.add(igrejinha);
        this.places.add(ufmg);
        this.places.add(casa);
        this.places.add(praca);
        this.places.add(parque);
        this.places.add(museu);
    }
    @Override
    public int getCount() {
        return this.places.size();
    }

    @Override
    public Object getItem(int i) {
        return this.places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place p = (Place) this.getItem(i);

        View placeLayout = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        TextView txtNome = placeLayout.findViewById(R.id.txt_place_name);
        TextView txtDesc = placeLayout.findViewById(R.id.txt_place_description);
        TextView txtDistancia = placeLayout.findViewById(R.id.txt_place_distance);
        ImageView fotoLugar = placeLayout.findViewById(R.id.img_place_photo);
        RatingBar rating = placeLayout.findViewById(R.id.rating_lugar);

        txtNome.setText(p.getName());
        txtDesc.setText(p.getDescricao());
        String dist = p.getDistance() + " km";
        txtDistancia.setText(dist);
        rating.setRating(p.getRate());
        fotoLugar.setImageResource(p.getPhotoId());

        return placeLayout;
    }
}
