package com.example.endangered;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAnimalAdapter extends RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder> {
    private ArrayList<Animal> listAnimal;

    public ListAnimalAdapter(ArrayList<Animal> list) { this.listAnimal = list; }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_animal, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Animal animal = listAnimal.get(position);

        Glide.with(holder.itemView.getContext())
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(animal.getAnimal_name());
        holder.tvStatus.setText(animal.getStatus());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context c = holder.itemView.getContext();
                    String photo = listAnimal.get(holder.getAdapterPosition()).getPhoto();
                    String name = listAnimal.get(holder.getAdapterPosition()).getAnimal_name();
                    String status = listAnimal.get(holder.getAdapterPosition()).getStatus();
                    String scientific_name = listAnimal.get(holder.getAdapterPosition()).getScientific_name();
                    String weight = listAnimal.get(holder.getAdapterPosition()).getWeight();
                    String population = listAnimal.get(holder.getAdapterPosition()).getPopulation();
                    String habitat = listAnimal.get(holder.getAdapterPosition()).getHabitat();
                    String detail = listAnimal.get(holder.getAdapterPosition()).getDetail();
                Intent detailIntent = new Intent(c,DetailActivity.class);
                    detailIntent.putExtra("EXTRA_PHOTO",photo);
                    detailIntent.putExtra("EXTRA_NAME",name);
                    detailIntent.putExtra("EXTRA_STATUS",status);
                    detailIntent.putExtra("EXTRA_SCIENTIFIC",scientific_name);
                    detailIntent.putExtra("EXTRA_WEIGHT",weight);
                    detailIntent.putExtra("EXTRA_POPULATION",population);
                    detailIntent.putExtra("EXTRA_HABITAT",habitat);
                    detailIntent.putExtra("EXTRA_DETAIL",detail);
                c.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAnimal.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvStatus;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvStatus = itemView.findViewById(R.id.tv_item_status);
        }
    }
}
