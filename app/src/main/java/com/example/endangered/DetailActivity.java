package com.example.endangered;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView tvReceivedName = findViewById(R.id.received_name);
        TextView tvReceivedStatus = findViewById(R.id.received_status);
        TextView tvReceivedScientific = findViewById(R.id.received_scientific);
        TextView tvReceivedWeight = findViewById(R.id.received_weight);
        TextView tvReceivedPopulation = findViewById(R.id.received_population);
        TextView tvReceivedHabitat = findViewById(R.id.received_habitat);
        TextView tvReceivedDetail = findViewById(R.id.received_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Animal Information");
        }

        String imgPhoto = getIntent().getStringExtra("EXTRA_PHOTO");
        Glide.with(this)
                .load(imgPhoto)
                .into((ImageView)findViewById(R.id.animal_image));

        String name = getIntent().getStringExtra("EXTRA_NAME");
        tvReceivedName.setText(name);

        String status = getIntent().getStringExtra("EXTRA_STATUS");
        tvReceivedStatus.setText(status);

        String scientific = getIntent().getStringExtra("EXTRA_SCIENTIFIC");
        tvReceivedScientific.setText(scientific);

        String weight = getIntent().getStringExtra("EXTRA_WEIGHT");
        tvReceivedWeight.setText(weight);

        String population = getIntent().getStringExtra("EXTRA_POPULATION");
        tvReceivedPopulation.setText(population);

        String habitat = getIntent().getStringExtra("EXTRA_HABITAT");
        tvReceivedHabitat.setText(habitat);

        String detail = getIntent().getStringExtra("EXTRA_DETAIL");
        tvReceivedDetail.setText(detail);
    }
}
