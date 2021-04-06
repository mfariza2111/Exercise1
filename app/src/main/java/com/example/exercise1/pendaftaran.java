package com.example.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class pendaftaran extends  AppCompatActivity{
EditText usr, email, alamat, pwd,repwd;
        TextView jnskelamin,agama;
        CheckBox laki,perempuan,islam,hindu,buddha,kristen,katholik,konghucu;
        Button daftar,batal;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendaftaran);

        usr = findViewById(R.id.ednama);
        email = findViewById(R.id.email);
        alamat = findViewById(R.id.edalamat);
        pwd = findViewById(R.id.edPass);
        repwd = findViewById(R.id.edrepass);
        jnskelamin = findViewById(R.id.edgender);
        agama = findViewById(R.id.edAgama);
        laki= findViewById(R.id.checkBox);
        perempuan = findViewById(R.id.checkBox2);
        islam = findViewById(R.id.checkBox3);
        kristen = findViewById(R.id.checkBox4);
        hindu = findViewById(R.id.checkBox5);
        katholik = findViewById(R.id.checkBox6);
        buddha = findViewById(R.id.checkBox7);
        konghucu = findViewById(R.id.checkBox8);
        daftar = findViewById(R.id.ldaftar);
        batal = findViewById(R.id.lbatal);

        batal.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if (usr.getText().toString().isEmpty() ||
        email.getText().toString().isEmpty() ||
        alamat.getText().toString().isEmpty() ||
        pwd.getText().toString().isEmpty() ||
        repwd.getText().toString().isEmpty())
        {
        Snackbar.make(view, "Fill the blank data", Snackbar.LENGTH_LONG).show();
        }
        else
        {
        if (pwd.getText().toString().equals(repwd.getText().toString()))
        {
        Toast.makeText(getApplicationContext(), "registration is successful",
        Toast.LENGTH_LONG).show();
        Intent i =new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        }
        else
        {
        Snackbar.make(view, "password and repassword must be same",
        Snackbar.LENGTH_LONG).show();
        }
        }
        }
        });

        }
        }