package com.rapio.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText q1;
    EditText q2;
    EditText sw;
    EditText le;
    EditText me;
    Button btn_Compute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1=(EditText) findViewById(R.id.etQ1);
        q2=(EditText) findViewById(R.id.etQ2);
        sw=(EditText) findViewById(R.id.etSW);
        le=(EditText) findViewById(R.id.etLE);
        me=(EditText) findViewById(R.id.etME);
        btn_Compute = (Button) findViewById(R.id.btnCompute);
    }
    public void compute(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        double dQ1 =.10*(Integer.parseInt(q1.getText().toString()));
        double dQ2 =.10*(Integer.parseInt(q2.getText().toString()));
        double dSW =.10*(Integer.parseInt(sw.getText().toString()));
        double dLE =.40*(Integer.parseInt(le.getText().toString()));
        double dME =.30*(Integer.parseInt(me.getText().toString()));
        double ra = dQ1+dQ2+dSW+dLE+dME;
        intent.putExtra("ra",Double.toString(ra));
        String fg = new String();
        if(ra<60){
            fg="Failed";
        }else if (ra<=65){
            fg="3.00";
        }
        else if (ra<=70){
            fg="2.75";
        }
        else if (ra<=75){
            fg="2.50";
        }
        else if (ra<=80){
            fg="2.25";
        }
        else if (ra<=85){
            fg="2.00";
        }
        else if (ra<=90){
            fg="1.75";
        }else if (ra<=92){
            fg="1.5";
        }
        else if (ra<=94){
            fg="1.25";
        }
        else if (ra<=100){
            fg="1.00";
        }
        intent.putExtra("fg",fg);
        startActivity(intent);
    }
}
