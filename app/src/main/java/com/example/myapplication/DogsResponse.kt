package com.example.myapplication

import com.google.gson.annotations.SerializedName

data class DogsResponse (
    @SerializedName("status") var status: String,
    // La linea de abajo es para recibir las URL y recibir la respuesta de la API
    @SerializedName("message") var images: List<String>
        )