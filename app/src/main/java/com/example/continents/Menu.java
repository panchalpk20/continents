package com.example.continents;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        try{
            this.getSupportActionBar().hide();
        } catch (Exception e){
            Log.e("","Excp::::;" +e.getMessage());
        }

        setContentView(R.layout.activity_menu);




    }

    public void goToIndia(View view) {
        startActivity(new Intent(Menu.this, India.class));
    }

    public void goToGlobe(View view) {

        startActivity(new Intent(Menu.this, MainActivity.class));


    }

    @Override
    public void onBackPressed() {
        final Dialog dialog = new Dialog(Menu.this);
        View view = getLayoutInflater().inflate(R.layout.exit, null);
        dialog.setContentView(view);

        view.findViewById(R.id.yes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        view.findViewById(R.id.no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
