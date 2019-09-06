package com.example.dagger2

import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine)