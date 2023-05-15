package br.ufmg.coltec.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlacesAdapter adapter = new PlacesAdapter(this);

        ListView lvPlaces = this.findViewById(R.id.lvPlaces);

        lvPlaces.setAdapter(adapter);

    }
}
