package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Mainlist
import java.lang.String


 internal class MyAdapter(private var empList : ArrayList<Mainlist>
                ): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var Name : TextView = view.findViewById(R.id.name)
        var Id: TextView = view.findViewById(R.id.id)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView =LayoutInflater.from(parent.context)
            .inflate(R.layout.listview, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val emp = empList[position]
        holder.Name.text = emp.getName()
        holder.Id.text = emp.getid()



    }

    override fun getItemCount(): Int {
        return empList.size
    }


}








