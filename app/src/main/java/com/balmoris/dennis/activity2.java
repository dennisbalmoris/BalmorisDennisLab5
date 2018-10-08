package com.balmoris.dennis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnAct1){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        } else if(v.getId()==R.id.btnMap2){
            i = new Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5889,12.9753"));
            chooser = Intent.createChooser(i, "Choose what application to use:");
            startActivity(chooser);
        }
    }
}
