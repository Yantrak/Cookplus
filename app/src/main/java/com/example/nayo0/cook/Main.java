package com.example.nayo0.cook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class Main extends AppCompatActivity {

    LinearLayout ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /*ln = (LinearLayout) findViewById(R.id.layout);

       /* ImageButton ib = (ImageButton) findViewById(R.id.pasta);
        ib.setImageResource(R.drawable.pasta);*/

        ImageButton ib2 = (ImageButton) findViewById(R.id.pasta2);
        ib2.setImageResource(R.drawable.pasta);

        ImageButton ib3 = (ImageButton) findViewById(R.id.pasta3);
        ib3.setImageResource(R.drawable.carne);

        /*ImageButton ib4 = (ImageButton) findViewById(R.id.pasta4);
        ib4.setImageResource(R.drawable.pasta);

        ImageButton ib5 = (ImageButton) findViewById(R.id.pasta5);
        ib5.setImageResource(R.drawable.pasta);*/


    }
    public void cmdBOnclick (View v) {
        Button bt1 = (Button) this.findViewById(R.id.boton1);
        Intent intent1 = new Intent(getApplicationContext(), Registro.class);
        startActivity(intent1);
        Button bt2 = (Button) this.findViewById(R.id.boton2);

    }

    public void cmdBOnclick2 (View v) {
        Button bt2 = (Button) this.findViewById(R.id.boton2);
        Intent intent2 = new Intent(getApplicationContext(), Exploracion.class);
        startActivity(intent2);

    }

    public void cmdBOnclick3 (View v) {
        ImageButton pasta = (ImageButton) findViewById(R.id.pasta);
        pasta.setImageResource(R.drawable.pasta);
        Intent intent2 = new Intent(getApplicationContext(), Exploracion.class);
        startActivity(intent2);
    }
}
