package com.example.listviewproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ManualBrewCustom extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_brew_custom);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_manualbrew);

        listView = findViewById(R.id.manualCustomList);

        //buat data
        ArrayList<ManualBrew> arrayList = new ArrayList<>();

        arrayList.add(new ManualBrew(R.drawable.pic_v60, "V60", "V60 atau pour over merupakan kopi hitam tanpa gula, biasanya dibutuhkan filter. Prosesnya dilakukan dengan mengalirkan air panas pada bubuk kopi di atas filter yang kemudian air tersebut akan menetes melalui saringan tersebut."));
        arrayList.add(new ManualBrew(R.drawable.pic_tubruk, "KOPI TUBRUK", "Kopi tubruk adalah minuman kopi khas Indonesia yang dibuat dengan menuangkan air panas ke dalam gelas atau teko yang sudah diisi bubuk kopi. Bisa dengan ditambahkan gula, bisa juga tanpa gula."));
        arrayList.add(new ManualBrew(R.drawable.pic_vietnam, "VIETNAMESE HOT DRIP", "Vietnam drip adalah salah satu teknik menyeduh kopi yang berasal dari Vietnam. vietnam drip ini memerlukan kertas filter dan penambahan air hangat dalam prosesnya."));
        arrayList.add(new ManualBrew(R.drawable.pic_japan, "JAPANESE ICE DRIP", "Japanese iced drip merupakan kopi yang diseduh dengan air panas, misalnya dengan metode pour over ataupun drip bag, kemudian langsung menetes ke es batu di dalam teko atau gelas"));

        //buat custom adapter
        ManualBrewAdapter manualBrewAdapter = new ManualBrewAdapter(this,R.layout.manualbrew_list,arrayList);

        listView.setAdapter(manualBrewAdapter);
    }
}