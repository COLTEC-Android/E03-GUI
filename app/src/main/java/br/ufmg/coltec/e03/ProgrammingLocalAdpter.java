package br.ufmg.coltec.e03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLocalAdpter extends BaseAdapter {

    private List<ProgrammingLocal> locais;
    private Context context;

    //Iniciando lista:
    public  ProgrammingLocalAdpter(Context context){
        this.locais = new ArrayList<>();
        this.context = context;

        //Carregando os dados:
        ProgrammingLocal local = new ProgrammingLocal("Açai da Hora", R.drawable.acai, 7.0, "Melhor loja de açai da cidade!", 5.0);
        ProgrammingLocal local2 = new ProgrammingLocal("Pastelaria do Japa", R.drawable.pastel, 10.0, "Pastelaria com os melhores sabores!", 4.0);
        ProgrammingLocal local3 = new ProgrammingLocal("Restaurante Resolve", R.drawable.restaurante, 5.0, "Ta com fome? Nosso restaurante Resolve!", 5.0);
        ProgrammingLocal local4 = new ProgrammingLocal("Distribuidora 51", R.drawable.cachaca, 3.0, "Os preços mais baixos de bebidas do mercado!", 4.0);
        this.locais.add(local);
        this.locais.add(local2);
        this.locais.add(local3);
        this.locais.add(local4);
    }

    @Override
    public int getCount() {
        return this.locais.size();
    }

    @Override
    public Object getItem(int i) {
        return this.locais.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ProgrammingLocal currentLocal = this.locais.get(i);

        View localLayout = LayoutInflater.from(this.context).inflate(R.layout.activity_localgetview, viewGroup, false);

        ImageView localImage = localLayout.findViewById(R.id.img_place_photo);
        TextView localName = localLayout.findViewById(R.id.txt_place_name);
        TextView localDescricao = localLayout.findViewById(R.id.txt_place_description);
        RatingBar localRate = localLayout.findViewById(R.id.rtb_rate);
        TextView localdistance = localLayout.findViewById(R.id.txt_place_distance);

        localImage.setImageResource(currentLocal.getPhotoId());
        localName.setText(currentLocal.getName());
        localDescricao.setText(currentLocal.getDescricao());
        localRate.setRating(currentLocal.getRate().floatValue());
        localdistance.setText(currentLocal.getDistance().toString());

        return localLayout;

    }

}
