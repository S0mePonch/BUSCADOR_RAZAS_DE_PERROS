package com.example.myapplication

import retrofit2.Response
import  retrofit2.http.GET
import  retrofit2.http.Url

interface APIService {
    // Este es para que reciba el status y el mensaje de la clase "DogsResponse"
    @GET
    suspend fun getDogsByBreeds(@Url url:String): Response<DogsResponse>
}