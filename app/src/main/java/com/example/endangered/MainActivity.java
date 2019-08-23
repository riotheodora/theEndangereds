package com.example.endangered;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnimals;
    private ArrayList<Animal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimals = findViewById(R.id.rv_animal);
        rvAnimals.setHasFixedSize(true);

        list.addAll(AnimalData.getListData());
        showRecyclerList();

        getSupportActionBar().setTitle("The Endangered");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("The Endangered");
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerList(){
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listAnimalAdapter = new ListAnimalAdapter(list);
        rvAnimals.setAdapter(listAnimalAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
        }
        return false;
    }
}
