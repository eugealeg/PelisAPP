package ort.edu.org.pelisapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nologinBtn = (Button) findViewById(R.id.nologin);
        nologinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topTenIntent = new Intent(getApplicationContext(), TopTenPag.class);
                topTenIntent.putExtra("org.edu.ort.PelisApp.SINLOGIN","No estas logueado, algunas de las funcionalidades estaran desactivadas.");
                startActivity(topTenIntent);
            }
        });

        Button loginBtn = (Button) findViewById(R.id.login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topTenIntent = new Intent(getApplicationContext(), TopTenPag.class);
                topTenIntent.putExtra("org.edu.ort.PelisApp.CONLOGIN","WELLCOME! Esperamos que disfrutes la experiencia :)");
                startActivity(topTenIntent);
            }
        });
    }
}
