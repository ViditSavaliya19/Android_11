package com.example.android_11_std;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BioData extends AppCompatActivity {

    private TextView name_txt,fname_txt,suraname_txt,village_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_data);
        binding();

        String name = getIntent().getStringExtra("n1");
        String surname = getIntent().getStringExtra("n2");
        String fname = getIntent().getStringExtra("n3");
        String village = getIntent().getStringExtra("n4");

        name_txt.setText(name);
        suraname_txt.setText(surname);
        fname_txt.setText(fname);
        village_txt.setText(village);




    }

    private void binding() {
        village_txt=findViewById(R.id.village_txt);
        name_txt=findViewById(R.id.name_txt);
        fname_txt=findViewById(R.id.fname_txt);
        suraname_txt=findViewById(R.id.suraname_txt);
    }
}