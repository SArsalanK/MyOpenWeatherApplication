package com.conneapp.assessment.myapplication.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/conneapp/assessment/myapplication/repository/WeatherForecastRepository;", "", "weatherForecastAPI", "Lcom/conneapp/assessment/myapplication/retrofit/WeatherForecastAPI;", "(Lcom/conneapp/assessment/myapplication/retrofit/WeatherForecastAPI;)V", "_weather", "Landroidx/lifecycle/MutableLiveData;", "Lcom/conneapp/assessment/myapplication/models/WeatherForecast;", "weather", "Landroidx/lifecycle/LiveData;", "getWeather", "()Landroidx/lifecycle/LiveData;", "getWeatherForecast", "", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherForecastRepository {
    private final com.conneapp.assessment.myapplication.retrofit.WeatherForecastAPI weatherForecastAPI = null;
    private final androidx.lifecycle.MutableLiveData<com.conneapp.assessment.myapplication.models.WeatherForecast> _weather = null;
    
    @javax.inject.Inject()
    public WeatherForecastRepository(@org.jetbrains.annotations.NotNull()
    com.conneapp.assessment.myapplication.retrofit.WeatherForecastAPI weatherForecastAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.conneapp.assessment.myapplication.models.WeatherForecast> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherForecast(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}