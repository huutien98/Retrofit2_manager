package com.vncoder.retrofit2_manager.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vncoder.retrofit2_manager.R
import com.vncoder.retrofit2_manager.entity.Employee
import com.vncoder.retrofit2_manager.entity.Root

class RootAdapter(ListEmployee:ArrayList<Root>) : RecyclerView.Adapter<RootAdapter.ViewHolder>() {

    private lateinit var ListEmployee : ArrayList<Employee>

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val status = itemView.findViewById<TextView>(R.id.status)
        val data = itemView.findViewById<TextView>(R.id.data)
        val message = itemView.findViewById<TextView>(R.id.message)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_root,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListEmployee.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemEmployee = ListEmployee[position]
        holder.status.setText(itemEmployee.name).toString()
        holder.data.setText(itemEmployee.age).toString()
        holder.message.setText(itemEmployee.salary).toString()

    }
}