package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.os.Bundle;

import br.ufmg.coltec.e03_layouts.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }
}
