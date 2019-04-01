package com.example.nayo0.cokk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ListView;


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView lv = (ListView) this.findViewById(R.id.lista1);

    }
    public void cmdBOnclick (View v) {
        Button bt1 = (Button) this.findViewById(R.id.boton1);
        Intent intent1 = new Intent(getApplicationContext(), Registro.class);
        startActivity(intent1);
        
        Button bt2 = (Button) this.findViewById(R.id.boton2);

    }
}
