package com.conneapp.assessment.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/conneapp/assessment/myapplication/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityMainBinding", "Lcom/conneapp/assessment/myapplication/databinding/ActivityMainBinding;", "mainViewModel", "Lcom/conneapp/assessment/myapplication/viewmodels/MainViewModel;", "mainViewModelFactory", "Lcom/conneapp/assessment/myapplication/viewmodels/MainViewModelFactory;", "getMainViewModelFactory", "()Lcom/conneapp/assessment/myapplication/viewmodels/MainViewModelFactory;", "setMainViewModelFactory", "(Lcom/conneapp/assessment/myapplication/viewmodels/MainViewModelFactory;)V", "weatherForecastRepository", "Lcom/conneapp/assessment/myapplication/repository/WeatherForecastRepository;", "getWeatherForecastRepository", "()Lcom/conneapp/assessment/myapplication/repository/WeatherForecastRepository;", "setWeatherForecastRepository", "(Lcom/conneapp/assessment/myapplication/repository/WeatherForecastRepository;)V", "initCityNameEditText", "", "initWeatherViewPager", "weatherForecast", "Lcom/conneapp/assessment/myapplication/models/WeatherForecast;", "loadWeatherData", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ScreenSlidePagerAdapter", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.conneapp.assessment.myapplication.repository.WeatherForecastRepository weatherForecastRepository;
    @javax.inject.Inject()
    public com.conneapp.assessment.myapplication.viewmodels.MainViewModelFactory mainViewModelFactory;
    private com.conneapp.assessment.myapplication.viewmodels.MainViewModel mainViewModel;
    private com.conneapp.assessment.myapplication.databinding.ActivityMainBinding activityMainBinding;
    @org.jetbrains.annotations.NotNull()
    public static final com.conneapp.assessment.myapplication.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String default_city_name = "Serbia";
    private static final int hours_in_a_day = 24;
    private static final int weather_refresh_hours_interval = 3;
    public static final int weather_refreshes_in_a_day = 8;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.conneapp.assessment.myapplication.repository.WeatherForecastRepository getWeatherForecastRepository() {
        return null;
    }
    
    public final void setWeatherForecastRepository(@org.jetbrains.annotations.NotNull()
    com.conneapp.assessment.myapplication.repository.WeatherForecastRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.conneapp.assessment.myapplication.viewmodels.MainViewModelFactory getMainViewModelFactory() {
        return null;
    }
    
    public final void setMainViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.conneapp.assessment.myapplication.viewmodels.MainViewModelFactory p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initCityNameEditText() {
    }
    
    private final void loadWeatherData() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void initWeatherViewPager(com.conneapp.assessment.myapplication.models.WeatherForecast weatherForecast) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/conneapp/assessment/myapplication/MainActivity$ScreenSlidePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "weatherForecast", "Lcom/conneapp/assessment/myapplication/models/WeatherForecast;", "(Lcom/conneapp/assessment/myapplication/MainActivity;Landroidx/fragment/app/FragmentActivity;Lcom/conneapp/assessment/myapplication/models/WeatherForecast;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
    final class ScreenSlidePagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        private final com.conneapp.assessment.myapplication.models.WeatherForecast weatherForecast = null;
        
        public ScreenSlidePagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity fa, @org.jetbrains.annotations.Nullable()
        com.conneapp.assessment.myapplication.models.WeatherForecast weatherForecast) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/conneapp/assessment/myapplication/MainActivity$Companion;", "", "()V", "default_city_name", "", "hours_in_a_day", "", "weather_refresh_hours_interval", "weather_refreshes_in_a_day", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}