package com.exemplo.aws.cameco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TepicActivity extends AppCompatActivity {
private Button volver;
private Button sig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tepic);
        volver = (Button) findViewById(R.id.Volver);
        sig = (Button) findViewById(R.id.aaaa);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver9 = new Intent(TepicActivity.this, HomeActivity.class);
                startActivity(volver9);
                finish();
            }

        });
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sigue = new Intent(TepicActivity.this, ComerActivity.class);
                startActivity(sigue);
                finish();
            }
        });
    }



}
