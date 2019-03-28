package com.exemplo.aws.cameco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XaliscoActivity extends AppCompatActivity {
private Button volver2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xalisco);
      volver2 = (Button) findViewById(R.id.btn1);
      volver2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent vplver3 = new Intent(XaliscoActivity.this, HomeActivity.class);
              startActivity(vplver3);
              finish();

          }
      });
    }
}
