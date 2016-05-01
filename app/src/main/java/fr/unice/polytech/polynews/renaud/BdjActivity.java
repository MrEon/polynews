package fr.unice.polytech.polynews.renaud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import fr.unice.polytech.polynews.R;

/**
 * Created by renaud on 14/04/2016.
 */
public class BdjActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bdj);

        final ImageButton backHome = (ImageButton) findViewById(R.id.back_home);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}

