package com.example.dagger2

import javax.inject.Inject
import dagger.Lazy

class Engine @Inject constructor(private var fuel: Lazy<Fuel>){
    @Inject
    lateinit var cylinder: Cylinder

    fun start(){
        if(fuel!=null){
            print("Started with ! ${fuel.get().fuelType}")
        }else{
            print("No more fuel!")
        }
    }
}