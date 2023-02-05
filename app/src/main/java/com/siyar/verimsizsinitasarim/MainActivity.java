package com.siyar.verimsizsinitasarim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

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

        // Keyboard hide kısmı //
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(resultLayout.getWindowToken(), 0);

            //Virgülden sonraki basamak sayısını ayarlayan kısım //
        NumberFormat sonUmut = NumberFormat.getNumberInstance();
        sonUmut.setMaximumFractionDigits(3);




                // T1 Hedef Hesaplama Kısmı //

        EditText t1 = findViewById(R.id.t1);
        EditText yapilan = findViewById(R.id.yapilan);
        EditText ayGun = findViewById(R.id.ayGun);
        EditText bugun = findViewById(R.id.bugun);
        TextView t1Sonuc = findViewById(R.id.t1Sonuc);

    double t1Veri = Double.parseDouble(t1.getText().toString());

    double yapilanVeri = Double.parseDouble(yapilan.getText().toString()); //MULTI USE
    double ayGunVeri = Double.parseDouble(ayGun.getText().toString()); //MULTI USE
    double bugunVeri = Double.parseDouble(bugun.getText().toString()); //MULTI USE



                // T1 Hedef Hesaplama Kısmı //

                          // // // //

                // T2 Hedef Hesaplama Kısmı //

        EditText t2 = findViewById(R.id.t2);
        TextView t2Sonuc = findViewById(R.id.t2Sonuc);

        double t2Veri = Double.parseDouble(t2.getText().toString());

        double t2Formul = (t2Veri - yapilanVeri) / (ayGunVeri - bugunVeri);
        String t2Formula = sonUmut.format(t2Formul);
        t2Sonuc.setText(""+t2Formula+"");

                // T2 Hedef Hesaplama Kısmı //

                        // // // //

                // Adet Hedef Hesaplama Kısmı //

        EditText adet = findViewById(R.id.adet);
        TextView adetSonuc = findViewById(R.id.adetSonuc);

        double adetVeri = Double.parseDouble(adet.getText().toString());

        double adetFormul = t2Formul / (yapilanVeri / adetVeri);
        String adetFormula = sonUmut.format(adetFormul);
        adetSonuc.setText(""+adetFormula+"");

                // Adet Hedef Hesaplama Kısmı //

                        // // // //

                // TL Verim Hesaplama Kısmı //

        EditText saat = findViewById(R.id.saat);
        TextView tlVerimSonuc = findViewById(R.id.tlVerimSonuc);

        double saatVeri = Double.parseDouble(saat.getText().toString());

        double tlVerimFormul = (t2Formul / saatVeri);
        String tlVerimFormula = sonUmut.format(tlVerimFormul);
        tlVerimSonuc.setText(""+tlVerimFormula+"");

                // TL Verim Hesaplama Kısmı //

                        // // // //

            // Adet Verim Hesaplama Kısmı //

        TextView adetVerimSonuc = findViewById(R.id.adetVerimSonuc);

        double adetVerimFormul = (adetFormul / saatVeri);
        String adetVerimFormula = sonUmut.format(adetVerimFormul);
        adetVerimSonuc.setText(""+adetVerimFormula+"");

            // Adet Verim Hesaplama Kısmı //

                    // // // //

            //  T1 Tamamlanan Kısmı //

            TextView t1TamamlananSonuc = findViewById(R.id.t1Tam);

            double t1TamFormul = (yapilanVeri / t1Veri) * 100;

            String t1TamFormula = sonUmut.format(t1TamFormul);
            t1TamamlananSonuc.setText("% " + ""+t1TamFormula+"");

            //  T1 Tamamlanan Kısmı //

                    // // // //

            //  T2 Tamamlanan Kısmı //

            TextView t2TamamlananSonuc = findViewById(R.id.t2Tam);

            double t2TamFormul = (yapilanVeri / t2Veri) * 100;

            String t2TamFormula = sonUmut.format(t2TamFormul);
            t2TamamlananSonuc.setText("% " + ""+t2TamFormula+"");

            //  T2 Tamamlanan Kısmı //

                    // // // //

            // Ay Tamamlanan Kısmı //


            TextView ayTamamlananSonuc = findViewById(R.id.ayTam);

            double ayTamFormul = ((bugunVeri - 1) / ayGunVeri) * 100;

            String ayTamFormula = sonUmut.format(ayTamFormul);
            ayTamamlananSonuc.setText("% " + ""+ayTamFormula+"");



        }

    }

