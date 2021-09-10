package com.example.recycleview

     class Mainlist(name: String?, id: String?) {

          private var name: String
          private var id: String

          init {
               this.name = name!!
               this.id = id!!
          }

          fun getName(): String? {
               return name
          }

          fun setName(empname: String?) {
               name = empname!!
          }

          fun getid(): String? {
               return id
          }

          fun setid(empid: String?) {
               id = empid!!

}}