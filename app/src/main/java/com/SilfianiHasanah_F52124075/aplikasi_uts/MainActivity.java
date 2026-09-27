package com.SilfianiHasanah_F52124075.aplikasi_uts;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    // Data Nama Teman
    String[] namaList = {
            "Taehyung",
            "Mingyu",
            "Haechan"
    };

    // Data NIM Teman (Sesuai permintaan)
    String[] nimList = {
            "F52124075",
            "F52124076",
            "F52124077"
    };

    // Data Status / Keterangan
    String[] statusList = {
            "Calon Suami 1",
            "Calon Suami 2",
            "Calon Suami 3"
    };

    // Data Foto (Mengambil dari folder drawable)
    int[] imageList = {
            R.drawable.taehyung,
            R.drawable.mingyu,
            R.drawable.haechan
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Menghubungkan CustomAdapter ke ListView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), namaList, nimList, statusList, imageList);
        listView.setAdapter(customAdapter);
    }
}