package com.vncoder.retrofit2_manager

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.vncoder.retrofit2_manager.Adapter.EmployeeAdapter
import com.vncoder.retrofit2_manager.Retrofit.API
import com.vncoder.retrofit2_manager.Retrofit.RetrofitClient
import com.vncoder.retrofit2_manager.entity.Employee
import com.vncoder.retrofit2_manager.entity.Root
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListStaff : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_staff)
        var rv_recyclerView = findViewById<RecyclerView>(R.id.rv_recyclerView)
        var sw_refresh = findViewById<SwipeRefreshLayout>(R.id.sw_refresh)


        val request: API = RetrofitClient.getClient().create(API::class.java)
        val call: Call<Root> = request.getAnswers()
        call.enqueue(object : Callback<Root>{
            override fun onResponse(call: Call<Root>?, response: Response<Root>?) {
                Toast.makeText(this@ListStaff,"this",Toast.LENGTH_LONG).show()
                var ListEmployee : ArrayList<Employee> = response!!.body().data as ArrayList<Employee>
                rv_recyclerView.adapter = EmployeeAdapter(ListEmployee)
            }

            override fun onFailure(call: Call<Root>?, t: Throwable?) {
                Toast.makeText(this@ListStaff,"erros",Toast.LENGTH_LONG).show()

            }

        })

        sw_refresh.setOnRefreshListener {
            val request: API = RetrofitClient.getClient().create(API::class.java)
            val call: Call<Root> = request.getAnswers()
            call.enqueue(object : Callback<Root>{
                override fun onResponse(call: Call<Root>?, response: Response<Root>?) {
                    Toast.makeText(this@ListStaff,"this",Toast.LENGTH_LONG).show()
                    var ListEmployee : ArrayList<Employee> = response!!.body().data as ArrayList<Employee>
                    rv_recyclerView.adapter = EmployeeAdapter(ListEmployee)
                }

                override fun onFailure(call: Call<Root>?, t: Throwable?) {
                    Toast.makeText(this@ListStaff,"server not found",Toast.LENGTH_LONG).show()

                }

            })
            sw_refresh.isRefreshing = false
        }



    }


}