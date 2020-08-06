package com.vncoder.retrofit2_manager.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vncoder.retrofit2_manager.Adapter.EmployeeAdapter.ViewHolder
import com.vncoder.retrofit2_manager.R
import com.vncoder.retrofit2_manager.entity.Employee

class EmployeeAdapter(ListEmployee:ArrayList<Employee>) : RecyclerView.Adapter<ViewHolder>() {

    private lateinit var ListEmployee : ArrayList<Employee>

    class ViewHolder(itemView :View):RecyclerView.ViewHolder(itemView) {
        val imageEmployee = itemView.findViewById<ImageView>(R.id.img_employeeImage)
        val nameEmployee = itemView.findViewById<TextView>(R.id.tv_employeeName)
        val ageEmployee = itemView.findViewById<TextView>(R.id.tv_employeeAge)
        val salaryEmployee = itemView.findViewById<TextView>(R.id.tv_employeeSalary)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_employee,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListEmployee.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemEmployee = ListEmployee[position]
        holder.imageEmployee.setImageResource(R.drawable.ic_launcher_background)
        holder.nameEmployee.setText(itemEmployee.name).toString()
        holder.ageEmployee.setText(itemEmployee.age).toString()
        holder.salaryEmployee.setText(itemEmployee.salary).toString()

    }
}