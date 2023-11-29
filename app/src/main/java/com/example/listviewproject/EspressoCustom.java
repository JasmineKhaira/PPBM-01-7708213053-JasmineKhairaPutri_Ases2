package com.example.listviewproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EspressoCustom extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso_custom);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_espresso);

        listView = findViewById(R.id.espressoCustomList);

        // buat data nya
        ArrayList<Espresso> arrayList = new ArrayList<>();

        arrayList.add(new Espresso(R.drawable.pic_espresso, "ESPRESSO", "Espreso adalah jenis kopi yang dihasilkan dengan mengekstraksi biji kopi yang sudah digiling dengan menyemburkan air panas di bawah tekanan tinggi. Espresso berasal dari bahasa Italia yang berarti express atau 'cepat'." ));
        arrayList.add(new Espresso(R.drawable.pic_cappucino, "CAPPUCCINO", "Kapucino adalah minuman kopi khas Italia yang dibuat dari espreso dan susu dengan takaran 1/3 espresso, 1/3 steamed milk dan 1/3 foamed milk"));
        arrayList.add(new Espresso(R.drawable.pic_americano, "AMERICANO", "Americano adalah minuman kopi yang dibuat dengan mencampurkan satu seloki espresso dengan air panas. Air panas yang digunakan dalam minuman ini adalah sebanyak 6 hingga 8 ons"));
        arrayList.add(new Espresso(R.drawable.pic_latte, "LATTE", "latte adalah espreso atau kopi yang dicampur dengan susu dan memiliki lapisan busa yang tipis di bagian atasnya. Perbandingan antara susu dengan kopi pada caffè latte adalah 2:1."));
        arrayList.add(new Espresso(R.drawable.pic_moccachino, "MOCCACHINO", "Moka adalah minuman kopi yang terbuat dari campuran espreso dengan coklat dan susu. Sederhananya, moccachino adalah cappuccino yang ditambahkan coklat"));

        // buat custom adapter
        EspressoAdapter espressoAdapter = new EspressoAdapter(this,R.layout.espresso_list,arrayList);

        listView.setAdapter(espressoAdapter);
    }
}