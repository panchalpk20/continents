package com.example.continents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView head, population, area, countries, desc;
    ImageView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        try{
            this.getSupportActionBar().hide();
        } catch (Exception e){
            log("Excp::::;" +e.getMessage());
        }

        setContentView(R.layout.activity_main2);

        head = findViewById(R.id.heading);
        population = findViewById(R.id.population);
        area = findViewById(R.id.area);
        countries = findViewById(R.id.countries);
        desc = findViewById(R.id.desc);
        desc.setMovementMethod(new ScrollingMovementMethod());

        map = findViewById(R.id.map);



        map.setImageResource(getIntent().getIntExtra("map", 0));
        desc.setText(getIntent().getStringExtra("description"));
        population.setText("Population: "+getIntent().getStringExtra("population"));
        area.setText("Area: "+getIntent().getStringExtra("area"));
        countries.setText("Number of Countries: "+getIntent().getStringExtra("countries"));
        head.setText(getIntent().getStringExtra("name"));


        log("map : "+map+"\n desc : "+desc+"\n popula: "+population+"\n area : "+area);


    }

    public void log(String s){
        Log.e("","Logging::"+s);
        //Toast.makeText(Main2Activity.this, "Logging ::" + s, Toast.LENGTH_LONG).show();
    }

    public void goState(View view) {
    }
}
