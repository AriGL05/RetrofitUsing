package com.example.retrofitusing;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonRequestInterface {

    @GET("pokemon?limit=100000&offset=0")
    Call<ServicePokemon> getPokemon();

}
