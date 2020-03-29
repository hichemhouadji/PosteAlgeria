package com.example.postealgerie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button mUtilisateur;
Button mAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAgent=(Button)findViewById(R.id.Agentid);
        mUtilisateur=(Button)findViewById(R.id.Utilisateur);


        mAgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agentintent=new Intent(MainActivity.this,AgentActivity.class);
                startActivity(agentintent);
            }
        });

   mUtilisateur.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent utilisateurintent=new Intent(MainActivity.this,UtilisateurActivity.class);
           startActivity(utilisateurintent);

       }
   });


    }
}
