package com.ypp.retrofit_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ypp.retrofit_api.API.ApiClient
import com.ypp.retrofit_api.adaptor.PostAdaotir
import com.ypp.retrofit_api.model.PostItem
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getPosts()
    }
    fun getPosts(){
        val apiClient=ApiClient()
        val apiCall=apiClient.postApiservice.getPost()
        apiCall.enqueue(object:Callback<ArrayList<PostItem>>{
            override fun onFailure(call: Call<ArrayList<PostItem>>, t: Throwable) {
//                Toast.makeText(
//                    applicationContext,
//                    t.toString(),
//                    Toast.LENGTH_LONG
//                ).show()

            }

            override fun onResponse(
                call: Call<ArrayList<PostItem>>,
                response: Response<ArrayList<PostItem>>
            ) {
//                Toast.makeText(
//                    applicationContext,
//                    response.toString(),
//                    Toast.LENGTH_LONG
//                ).show()

                recyclerView.apply {
                    layoutManager=LinearLayoutManager(context)
                    adapter=PostAdaotir(response.body()!!)
                }

            }

        })
    }
}