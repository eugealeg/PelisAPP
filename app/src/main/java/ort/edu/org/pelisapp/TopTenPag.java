package ort.edu.org.pelisapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TopTenPag extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_ten_pag);

        if(getIntent().hasExtra("org.edu.ort.PelisApp.SINLOGIN")){
            TextView tv = (TextView) findViewById(R.id.bienvenido);
            String text = getIntent().getExtras().getString("org.edu.ort.PelisApp.SINLOGIN");
            tv.setText(text);
        }
        if(getIntent().hasExtra("org.edu.ort.PelisApp.CONLOGIN")){
            TextView tv = (TextView) findViewById(R.id.bienvenido);
            String text = getIntent().getExtras().getString("org.edu.ort.PelisApp.CONLOGIN");
            tv.setText(text);
        }
    }
}
