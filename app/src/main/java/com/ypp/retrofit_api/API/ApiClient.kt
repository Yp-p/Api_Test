package com.ypp.retrofit_api.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient{
    private val baseUrl="https://my-json-server.typicode.com/typicode/demo/"

    private  var retrofit:Retrofit?=null
    init {
//        fun getRetrofitClient():Retrofit?{
            if (retrofit==null){
                retrofit=Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
            }
//            return retrofit }
    }
    val postApiservice=retrofit!!.create(
        ApiInterface::class.java
    )
}