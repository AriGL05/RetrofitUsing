package com.example.retrofitusing.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonHolder> {
    private List<Pokemon>
    @NonNull
    @Override
    public PokemonAdapter.PokemonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.PokemonHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PokemonHolder {
    }
}
