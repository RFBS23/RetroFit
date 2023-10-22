package com.fabridev.aprenderamodernizar

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object{
        val  mainURL = "https://jsonplaceholder.typicode.com/"
        fun getRetrofitInstance(): Retrofit{
            return Retrofit.Builder()
                .baseUrl(mainURL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
        }
    }
}

