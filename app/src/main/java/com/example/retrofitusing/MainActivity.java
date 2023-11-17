package com.example.retrofitusing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofitusing.adapters.PokemonAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        getPokemon();

    }
    private void getPokemon(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PokemonRequestInterface pokemonRequestInterface = retrofit.create(PokemonRequestInterface.class);

        Call<ServicePokemon> peticion = pokemonRequestInterface.getPokemon();
        peticion.enqueue(new Callback<ServicePokemon>() {
            @Override
            public void onResponse(Call<ServicePokemon> call, Response<ServicePokemon> response) {
                if(response.isSuccessful()){
                    ServicePokemon servicePokemon = response.body();
                    PokemonAdapter pokemonAdapter = new PokemonAdapter(servicePokemon.getResults());
                    recyclerView.setAdapter(pokemonAdapter);

                }
            }

            @Override
            public void onFailure(Call<ServicePokemon> call, Throwable t) {

            }
        });
    }

}