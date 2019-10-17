package com.example.layout_views_resources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    Button Count_button=(Button)findViewById(R.id.count);
    Button Reset_button=(Button)findViewById(R.id.reset);
    final TextView text_contador = (TextView)findViewById(R.id.contador);


    Count_button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
             contador ++;
            text_contador.setText(Integer.toString(contador));

        }
    });

     Reset_button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){

            text_contador.setText("0");
            contador=0;
        }
    });

    }

}
