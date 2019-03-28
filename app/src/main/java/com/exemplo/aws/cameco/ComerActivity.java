package com.exemplo.aws.cameco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComerActivity extends AppCompatActivity {
    private Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comer);
        reg = (Button) findViewById(R.id.centro_vol);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vol = new Intent(ComerActivity.this, HomeActivity.class);
                startActivity(vol);
                finish();
            }
        });
    }
}
