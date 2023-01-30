package com.siyar.verimsizsinitasarim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void baslat (View view) {
        TableLayout resultLayout = findViewById(R.id.resultLayout);
        resultLayout.setVisibility(View.VISIBLE);


                // T1 Hedef Hesaplama Kısmı //
        EditText t1 = findViewById(R.id.t1);
        EditText yapilan = findViewById(R.id.yapilan);
        EditText ayGun = findViewById(R.id.ayGun);
        EditText bugun = findViewById(R.id.bugun);
        TextView t1Sonuc = findViewById(R.id.t1Sonuc);


        double t1Veri = Double.parseDouble(t1.getText().toString());
        double yapilanVeri = Double.parseDouble(yapilan.getText().toString());
        double ayGunVeri = Double.parseDouble(ayGun.getText().toString());
        double bugunVeri = Double.parseDouble(bugun.getText().toString());



        double t1Formul = (t1Veri - yapilanVeri) / (ayGunVeri - bugunVeri);

        NumberFormat sonUmut = NumberFormat.getNumberInstance();
        sonUmut.setMaximumFractionDigits(3);
        String t1Formula = sonUmut.format(t1Formul);

        t1Sonuc.setText(""+t1Formula+"");


                // T1 Hedef Hesaplama Kısmı //

    }
}