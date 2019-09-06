package com.example.dagger2

import dagger.Component

@Component
interface DaggerComponent {
    fun getCar(): Car
    fun getEngine(): Engine
    fun getFuel(): Fuel
}