package com.example.mspace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button petugas,siswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        petugas = (Button) findViewById(R.id.petugas);
        siswa = (Button) findViewById(R.id.siswa);

        petugas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = null;

                i = new Intent(MainActivity.this,Login.class);

                startActivity(i);
            }
        });

        siswa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = null;

                i = new Intent(MainActivity.this,LantaiSatu.class);

                startActivity(i);
            }
        });

    }
}
