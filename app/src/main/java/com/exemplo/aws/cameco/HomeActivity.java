package com.exemplo.aws.cameco;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.firebase.auth.FirebaseAuth;


public class HomeActivity extends AppCompatActivity  {

private FirebaseAuth mAuth;
private Button logout;
private Button centro;
private Button zxalico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
      mAuth = FirebaseAuth.getInstance();
      logout = (Button) findViewById(R.id.salir_perro);
      centro = (Button) findViewById(R.id.button3);
      zxalico = (Button) findViewById(R.id.button4);





      logout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mAuth.signOut();
              finish();
              startActivity(new Intent(HomeActivity.this, LoginActivity.class));
          }
      });

     centro.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent siguiente = new Intent(HomeActivity.this , TepicActivity.class);
             startActivity(siguiente);
             finish();
         }
     });

     zxalico.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent volver9 = new Intent(HomeActivity.this, XaliscoActivity.class);
             startActivity(volver9);
             finish();
         }
     });

    }




}
