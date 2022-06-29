package com.conneapp.assessment.myapplication.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/conneapp/assessment/myapplication/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherForecastRepository", "Lcom/conneapp/assessment/myapplication/repository/WeatherForecastRepository;", "(Lcom/conneapp/assessment/myapplication/repository/WeatherForecastRepository;)V", "cityName", "", "getCityName", "()Ljava/lang/String;", "setCityName", "(Ljava/lang/String;)V", "weatherData", "Landroidx/lifecycle/LiveData;", "Lcom/conneapp/assessment/myapplication/models/WeatherForecast;", "getWeatherData", "()Landroidx/lifecycle/LiveData;", "getWeatherForecastData", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.conneapp.assessment.myapplication.repository.WeatherForecastRepository weatherForecastRepository = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cityName = "Serbia";
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.conneapp.assessment.myapplication.repository.WeatherForecastRepository weatherForecastRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.conneapp.assessment.myapplication.models.WeatherForecast> getWeatherData() {
        return null;
    }
    
    public final void getWeatherForecastData() {
    }
}