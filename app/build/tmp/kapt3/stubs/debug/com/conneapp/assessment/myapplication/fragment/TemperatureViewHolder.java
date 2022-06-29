package com.conneapp.assessment.myapplication.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/conneapp/assessment/myapplication/fragment/TemperatureViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "temperatureListItemBinding", "Lcom/conneapp/assessment/myapplication/databinding/TemperatureListItemBinding;", "(Lcom/conneapp/assessment/myapplication/databinding/TemperatureListItemBinding;)V", "bindTemperature", "", "temperature", "Lcom/conneapp/assessment/myapplication/models/WeatherData;", "Companion", "app_debug"})
public final class TemperatureViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.conneapp.assessment.myapplication.databinding.TemperatureListItemBinding temperatureListItemBinding = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.conneapp.assessment.myapplication.fragment.TemperatureViewHolder.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String image_url = "http://openweathermap.org/img/wn/";
    
    public TemperatureViewHolder(@org.jetbrains.annotations.NotNull()
    com.conneapp.assessment.myapplication.databinding.TemperatureListItemBinding temperatureListItemBinding) {
        super(null);
    }
    
    public final void bindTemperature(@org.jetbrains.annotations.NotNull()
    com.conneapp.assessment.myapplication.models.WeatherData temperature) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/conneapp/assessment/myapplication/fragment/TemperatureViewHolder$Companion;", "", "()V", "image_url", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}