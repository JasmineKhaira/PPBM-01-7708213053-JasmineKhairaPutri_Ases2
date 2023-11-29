package com.example.listviewproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FrappeCustom extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frappe_custom);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_frappe);

        listView = findViewById(R.id.frappeCustomList);

        // buat data nya
        ArrayList<Frappe> arrayList = new ArrayList<>();

        arrayList.add(new Frappe(R.drawable.pic_mochafrappe, "MOCHA FRAPPE", "Mocha Frappe adalah minuman kopi beku yang terbuat dari bubuk espresso instan, susu, gula, bubuk kakao, dan es "));
        arrayList.add(new Frappe(R.drawable.pic_caramelfrappe, "CARAMEL FREEZE", "Caramel Freeze Frappe adalah minuman kopi beku yang terbuat dari susu, gula, kopi, dan es, serta sirup karamel "));
        arrayList.add(new Frappe(R.drawable.pic_banoffee, "BANOFFEE CREAM", "Banoffee Cream Frappe adalah minuman kopi beku yang terbuat dari susu, gula, kopi, dan es, serta sirup karamel "));
        arrayList.add(new Frappe(R.drawable.pic_toffee, "TOFFEE NUT", "Toffee Nut Frappe adalah minuman kopi beku yang terbuat dari susu, gula, kopi, dan es, serta sirup toffee nut "));
        arrayList.add(new Frappe(R.drawable.pic_darkchoco, "DARK CHOCOLATE", "Dark Chocolate Frappe adalah minuman kopi beku yang terbuat dari susu, gula, kopi, dan es, serta cokelat hitam"));

        // buat custom adapter
        FrappeAdapter frappeAdapter = new FrappeAdapter(this,R.layout.frappe_list,arrayList);

        listView.setAdapter(frappeAdapter);
    }
}