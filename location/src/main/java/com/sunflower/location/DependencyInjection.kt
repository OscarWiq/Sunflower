package com.sunflower.location

import org.koin.dsl.module

val locationProvider = CachedLocationProvider()

val locationModule = module {
    single<LocationListener> { locationProvider }
    single<LocationProvider> { locationProvider }
}