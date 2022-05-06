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

public class PlaceAdapter  extends BaseAdapter {

    private ArrayList<Place> places;
    private Context context;

    public PlaceAdapter(Context context){
        this.context=context;
        places = new ArrayList<>();
        //carrega dados da lista - criar os places e incluir na lista
        places.add(new Place("Praca do Papa",
                "Situa-se próxima à base da Serra do Curral, ao final da Avenida Agulhas Negras e a mais de 1.100 m de altitude.",
                R.drawable.prcpapa,
                5.00,
                3.0));
        places.add(new Place("Praca da Liberdade",
                "É um suntuoso conjunto arquitetônico com belos edifícios e jardins, entre eles o Palácio da Liberdade, antiga sede do Governo de Minas Gerais.",
                R.drawable.prcliberdade,
                4.00,
                5.0));
        places.add(new Place("Igreja São Francisco",
                "Projetada pelo arquiteto Oscar Niemeyer, foi considerada uma grande inovação arquitetônica.",
                R.drawable.igjsaofrancisco,
                4.00,
                5.0));
    }

    public int getCount(){
        return this.places.size();
    }

    public Object getItem(int i){
        return this.places.get(i);
    }

    public long getItemId(int i){
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup){
        Place places = this.places.get(i);

        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place,viewGroup, false);

        ImageView lblimage = newView.findViewById(R.id.img_place_photo);
        TextView lblname = newView.findViewById(R.id.txt_place_name);
        TextView lbldescription = newView.findViewById(R.id.txt_place_description);
        RatingBar lblavaliacao =newView.findViewById(R.id.avaliacao);
        TextView lbldistance = newView.findViewById(R.id.txt_place_distance);

        lblimage.setImageResource(places.getPhotoId());
        lblname.setText(places.getName());
        lbldescription.setText(places.getDescription());
        lblavaliacao.setRating(places.getRate().floatValue());
        lbldistance.setText(places.getDistance().toString());
        return newView;
    }

}
