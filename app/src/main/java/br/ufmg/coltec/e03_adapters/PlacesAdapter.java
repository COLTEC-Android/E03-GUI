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

public class PlacesAdapter extends BaseAdapter {

    public PlacesAdapter(Context context){
        this.context = context;

        this.places = new ArrayList<Place>();

        carregaLista();
    }

    public void carregaLista(){
        this.places.add(new Place("Rua do Ouro", 1234, 2.4, 3.5F, "rua esquisita ali do bairro"));
        this.places.add(new Place("Praça da Liberdade", 4321, 6.4, 4.0F, "Praça famosa de bh"));
    }

    //Atributos
    private List<Place> places;
    private Context context;

    @Override
    public int getCount() {
        return this.places.size();
    }

    @Override
    public Object getItem(int position) {
        return this.places.get(position);
    }

    @Override
    public long getItemId(int position) {

        Place place = this.places.get(position);
        return place.getPhotoId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Place atual = this.places.get(position);

        //Inicia a lista dinamicamente
        View placeView = LayoutInflater.from(this.context)
                .inflate(R.layout.list_item_place, parent, false);

        //Popular os dados do LayoutInflater com os valores da lista de Places
        ImageView placePhoto = placeView.findViewById(R.id.img_place_photo);
        TextView placeName = placeView.findViewById(R.id.txt_place_name);
        TextView placeDescription = placeView.findViewById(R.id.txt_place_description);
        RatingBar rtBar = placeView.findViewById(R.id.rating_place_vote);
        TextView placeDistance = placeView.findViewById(R.id.txt_place_distance);


        placeName.setText(atual.getName());
        placeDescription.setText(atual.getDescription());
        rtBar.setRating(atual.getRate());
        placeDistance.setText(atual.getDistance().toString() + "Km");



        return placeView;
    }
}
