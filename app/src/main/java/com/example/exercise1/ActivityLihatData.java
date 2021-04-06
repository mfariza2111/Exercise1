package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import com.example.exercise1.R;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Selma":
                tvnama.setText("Selma");
                tvnomor.setText("0812222222222");
                break;
            case "Putri":
                tvnama.setText("Putri");
                tvnomor.setText("0812222222223");
                break;
            case "Chika":
                tvnama.setText("Chika");
                tvnomor.setText("0812222222224");
                break;
            case "Alifhia":
                tvnama.setText("Alifhia");
                tvnomor.setText("0812222222225");
                break;
            case "Selmatiranika":
                tvnama.setText("Selmatiranika");
                tvnomor.setText("0812222222226");
                break;
            case "Ristina":
                tvnama.setText("Ristina");
                tvnomor.setText("081222222227");
                break;
            case "DevaraDhea":
                tvnama.setText("Devharadhea");
                tvnomor.setText("0812222222228");
                break;
            case "Rika":
                tvnama.setText("Rika");
                tvnomor.setText("0812222222229");
                break;
            case "Medi":
                tvnama.setText("Medi");
                tvnomor.setText("0812222222210");
                break;
            case "Tono":
                tvnama.setText("tono");
                tvnomor.setText("0812222222211");
                break;
        }
    }
}