package com.example.mspace;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mspace.R;



public class LantaiSatu extends AppCompatActivity {

    private Button btn,btnRuang1,btnRuang2,btnRuang3,btnRuang4,btnRuang5
            ,btnRuang6,btnRuang7,btnRuang8,btnRuang9,btnRuang10,btnRuang11,
            btnRuang12,btnRuang13,btnRuang14,btnRuang15,btnLapangan,btnAula,btnBasket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_satu);

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, LantaiDua.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang1 = (Button)findViewById(R.id.btnRuang1);
        btnRuang1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang2 = (Button)findViewById(R.id.btnRuang2);
        btnRuang2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang3 = (Button)findViewById(R.id.btnRuang3);
        btnRuang3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang4 = (Button)findViewById(R.id.btnRuang4);
        btnRuang4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang5 = (Button)findViewById(R.id.btnRuang5);
        btnRuang5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang6 = (Button)findViewById(R.id.btnRuang6);
        btnRuang6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang7 = (Button)findViewById(R.id.btnRuang7);
        btnRuang7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang8 = (Button)findViewById(R.id.btnRuang8);
        btnRuang8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang9 = (Button)findViewById(R.id.btnRuang9);
        btnRuang9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang10 = (Button)findViewById(R.id.btnRuang10);
        btnRuang10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang11 = (Button)findViewById(R.id.btnRuang11);
        btnRuang11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang12 = (Button)findViewById(R.id.btnRuang12);
        btnRuang12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang13 = (Button)findViewById(R.id.btnRuang13);
        btnRuang13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang14 = (Button)findViewById(R.id.btnRuang14);
        btnRuang14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnRuang15 = (Button)findViewById(R.id.btnRuang15);
        btnRuang15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnLapangan = (Button)findViewById(R.id.btnUpacara);
        btnLapangan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnAula = (Button)findViewById(R.id.btnAula);
        btnAula.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

        btnBasket = (Button)findViewById(R.id.btnBasket);
        btnBasket.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LantaiSatu.this, Form.class);
//                Intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });

    }
}
