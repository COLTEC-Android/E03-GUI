package br.ufmg.coltec.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView placeListView = findViewById(R.id.placelist);//colocar o id da list view que eu vou criar dentro da activity main
        placeListView.setAdapter(new PlaceAdapter(this));
    }
}
