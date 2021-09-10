package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private val mainlist = ArrayList<Mainlist>()
    private lateinit var empAdapter:MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Employee Details"

        val recyleView: RecyclerView = findViewById(R.id.rvContacts)
        empAdapter= MyAdapter(mainlist)
        val layoutManager= LinearLayoutManager(this)
               recyleView.layoutManager =  layoutManager
                recyleView.itemAnimator= DefaultItemAnimator()
                    recyleView.adapter= empAdapter
                    empDetailsData()


    }

    private fun empDetailsData(){
                var employee = Mainlist("Naren","Rajasthan")
                mainlist.add(employee)


                employee = Mainlist("Naren2","Rajasthan")
                mainlist.add(employee)


                 employee = Mainlist("Naren3","Rajasthan")
                mainlist.add(employee)


                 employee = Mainlist("Naren4","Rajasthan")
                mainlist.add(employee)

                employee = Mainlist("Naren5","Rajasthan")
                mainlist.add(employee)


                employee = Mainlist("Naren6","Rajasthan")
                mainlist.add(employee)


                employee = Mainlist("Naren7","Rajasthan")
                mainlist.add(employee)

                employee = Mainlist("Naren8","Rajasthan")
                mainlist.add(employee)


                employee = Mainlist("Naren9","Rajasthan")
                mainlist.add(employee)


                employee = Mainlist("Naren0","Rajasthan")
                mainlist.add(employee)

                //empAdapter.nofityDataSetChanged()

            }


}








