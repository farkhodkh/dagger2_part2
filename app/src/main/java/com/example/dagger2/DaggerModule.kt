package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DaggerModule {
    @Binds
    fun bindDriver(driver: Ivanov): Driver
}