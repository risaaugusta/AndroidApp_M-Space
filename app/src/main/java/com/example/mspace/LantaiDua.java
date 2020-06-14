package com.example.mspace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LantaiDua extends AppCompatActivity {

    private Button btn,btnRuang16,btnRuang17,btnRuang18,btnRuang19,btnRuang20
            ,btnRuang21,btnMushola,btnLab,btnRuangTeori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_dua);

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, LantaiSatu.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang16 = (Button)findViewById(R.id.btnRuang16);
        btnRuang16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang17 = (Button)findViewById(R.id.btnRuang17);
        btnRuang17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang18 = (Button)findViewById(R.id.btnRuang18);
        btnRuang18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });


        btnRuang19 = (Button)findViewById(R.id.btnRuang19);
        btnRuang19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang20 = (Button)findViewById(R.id.btnRuang20);
        btnRuang20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang21 = (Button)findViewById(R.id.btnRuang21);
        btnRuang21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnMushola = (Button)findViewById(R.id.btnMushola);
        btnMushola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnLab = (Button)findViewById(R.id.btnLab);
        btnLab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuangTeori = (Button)findViewById(R.id.btnRuangTeori);
        btnRuangTeori.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiDua.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });


    }
}
