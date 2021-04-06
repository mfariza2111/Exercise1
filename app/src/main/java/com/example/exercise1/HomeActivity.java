package com.example.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener  {

    SearchView searchView;
    private ListView list;
    private ListViewAdapter adapter;
    String[] listnama;
    public static ArrayList<com.example.exercise1.classNama> classNamaArrayList = new ArrayList<classNama>();
    Bundle bundle = new Bundle();
    Intent intent;
    ArrayAdapter<String > arrayAdapter;
    String detail_kontak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_home);
        searchView = findViewById(R.id.search);
        listnama = new String[]{"Selma", "Putri", "Chika", "Alifhia", "Selmatiranika", "Ristina", "DhevaraDhea",
                "Rika", "Medi", "Tono",};
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,listnama);
        list = findViewById(R.id.listKontak);
        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listnama.length; i++) {
            com.example.exercise1.classNama classNama = new com.example.exercise1.classNama(listnama[i]);
            classNamaArrayList.add(classNama);
            adapter = new ListViewAdapter(this);
            list.setAdapter(arrayAdapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    detail_kontak = classNamaArrayList.get(position).getName();
                    bundle.putString("a", detail_kontak.trim());
                    PopupMenu pm = new PopupMenu(getApplicationContext(), view);
                    pm.setOnMenuItemClickListener(HomeActivity.this);
                    pm.inflate(R.menu.popup_menu);
                    pm.show();



                }
            });
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    HomeActivity.this.arrayAdapter.getFilter().filter(query);
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    HomeActivity.this.arrayAdapter.getFilter().filter(newText);
                    return false;
                }
            });

        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                String nomor_kontak = detail_kontak.trim();
                String isinomor = "";
                if (nomor_kontak == "Selma"){
                    isinomor = "0812222222222";
                }
                else if (nomor_kontak == "Putri"){
                    isinomor = "0812222222223";
                }
                else if (nomor_kontak == "Chika"){
                    isinomor = "0812222222224";
                }
                else if (nomor_kontak == "Alifhia"){
                    isinomor = "0812222222225";
                }
                else if (nomor_kontak == "Selmatiranika") {
                    isinomor = "0812222222226";
                }
                else if (nomor_kontak == "Ristina"){
                    isinomor = "0812222222227";
                }
                else if (nomor_kontak == "Devharadhea"){
                    isinomor = "0812222222228";
                }
                else if (nomor_kontak == "Rika") {
                    isinomor = "0812222222229";
                }
                else if (nomor_kontak == "Medi"){
                    isinomor = "08122222222210";
                }
                else if (nomor_kontak == "tono"){
                    isinomor = "08122222222211";
                }
                Toast.makeText(getApplicationContext(),isinomor, Toast.LENGTH_LONG).show();
                break;

        }
        return false;

    }

}