package com.balmoris.dennis;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnAct2){
            i = new Intent(this,activity2.class);
            startActivity(i);
        } else if(v.getId()==R.id.btnMap1){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5810,121.1642"));
            chooser = Intent.createChooser(i, "Choose what application to use:");
            startActivity(chooser);
        }
    }
}