package br.ufmg.coltec.e03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ProgrammingLocalAdpter plAdapter = new ProgrammingLocalAdpter(this);
        ListView locallist = this.findViewById(R.id.local_list);
        locallist.setAdapter(plAdapter);


    }
}