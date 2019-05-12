package com.example.nayo0.cook;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        TextView tv = (TextView) this.findViewById(R.id.txt1);
        EditText et1 = (EditText) this.findViewById(R.id.edtxt1);
        EditText et2 = (EditText) this.findViewById(R.id.edtxt2);
        EditText et3 = (EditText) this.findViewById(R.id.edtxt3);

    }

    public void cmdBOnclick (View v) {
        Button bt1 = (Button) this.findViewById(R.id.boton3);

        StringBuffer  stringBuffer =  new StringBuffer();
        stringBuffer.append("Registro completado.\n");

        Toast.makeText(getApplicationContext(), stringBuffer.toString(), Toast.LENGTH_LONG).show();

    }

    public void cmdBOnclick3 (View v) {
        Button bt2 = (Button) this.findViewById(R.id.boton4);
        Intent intent1 = new Intent(getApplicationContext(), Login.class);
        startActivity(intent1);
    }
}
