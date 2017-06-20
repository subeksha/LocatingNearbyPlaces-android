package com.example.subeksha.nearbyloc;

import com.example.subeksha.nearbyloc.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Subeksha on 6/19/17.
 */

public interface RetrofitMaps {

    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyB5HdsB6YY5UhZtqQZVrU32y12uAjCYILc")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}