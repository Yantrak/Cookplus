package com.example.nayo0.cook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        TextView tv = (TextView) this.findViewById(R.id.txt2);
        EditText et2 = (EditText) this.findViewById(R.id.edtxt2);
        EditText et3 = (EditText) this.findViewById(R.id.edtxt3);

    }

    public void cmdBOnclick (View v) {
        Button bt1 = (Button) this.findViewById(R.id.boton3);
        Intent intent1 = new Intent(getApplicationContext(), Main.class);
        startActivity(intent1);


    }
}
