package com.example.utspemrogramanbergerak;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edttugas;
    EditText edtuts;
    EditText edtuas;
    EditText namamhs;
    int project;
    Button btnHitung;
    TextView outernama;
    RadioGroup rbgrup;
    RadioButton edtprojectA,edtprojectB,edtprojectC,edtprojectE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namamhs = findViewById(R.id.namamahasiswa);
        edtprojectA= findViewById(R.id.A);
        edtprojectB= findViewById(R.id.B);
        edtprojectC=findViewById(R.id.C);
        edtprojectE= findViewById(R.id.E);
        rbgrup = findViewById(R.id.rbgrup);
        edttugas = findViewById(R.id.nilaitugas);
        edtuts = findViewById(R.id.nilaiuts);
        edtuas = findViewById(R.id.nilaiuas);
        btnHitung = findViewById(R.id.tombol);
        outernama = findViewById(R.id.namamhs);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String tgs = edttugas.getText().toString().trim();
                String uts = edtuts.getText().toString().trim();
                String uas = edtuas.getText().toString().trim();
                String nama = namamhs.getText().toString().trim();

                double nrb = rbgrup.getCheckedRadioButtonId();
                if ( nrb == R.id.A){
                    project = 100;
                }else if (nrb ==R.id.B){
                    project = 80;
                }else if (nrb == R.id.C){
                    project = 60;
                }else{
                    project = 0;
                }
                int nproject = Integer.parseInt(String.valueOf(project));
                double t = Double.parseDouble(tgs);
                double ut = Double.parseDouble(uts);
                double ua = Double.parseDouble(uas);
                double nilai = (0.25 * nproject) + (0.15 * t) + (0.2 * ut) + (0.4 * ua);
                outernama.setText("Nama Mahasiswa : "+nama+"\nNilai Akhir = " + nilai);

            }
        });

    }
}
