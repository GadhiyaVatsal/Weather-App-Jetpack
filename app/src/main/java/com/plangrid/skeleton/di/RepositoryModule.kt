package com.plangrid.skeleton.di

import com.plangrid.skeleton.data.repository.WeatherRepositoryImpl
import com.plangrid.skeleton.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
            weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}