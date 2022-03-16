package com.example.android_11_std;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Data_Activity extends AppCompatActivity {

    private ImageView done;
    private EditText fname_edt,name_edt,village_edt,surname_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        binding();
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= name_edt.getText().toString();
                String fname= fname_edt.getText().toString();
                String surname= surname_edt.getText().toString();
                String village= village_edt.getText().toString();

                Toast.makeText(Data_Activity.this, name+"\n"+fname+"\n"+surname+"\n"+village, Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(Data_Activity.this,BioData.class);
                intent.putExtra("n1",name);
                intent.putExtra("n2",surname);
                intent.putExtra("n3",fname);
                intent.putExtra("n4",village);
                startActivity(intent);

            }
        });


    }

    private void binding() {
        done=findViewById(R.id.done);
        name_edt=findViewById(R.id.name_edt);
        fname_edt=findViewById(R.id.fname_edt);
        surname_edt=findViewById(R.id.surname_edt);
        village_edt=findViewById(R.id.village_edt);
    }
}