package com.ypp.retrofit_api.API

import com.ypp.retrofit_api.model.PostItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface{
    @GET("posts")
    fun getPost():Call<ArrayList<PostItem>>

}