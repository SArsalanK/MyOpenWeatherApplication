package com.conneapp.assessment.myapplication.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/conneapp/assessment/myapplication/di/ApplicationComponent;", "", "inject", "", "mainActivity", "Lcom/conneapp/assessment/myapplication/MainActivity;", "injectFrag", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
@dagger.Component(modules = {com.conneapp.assessment.myapplication.di.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.conneapp.assessment.myapplication.MainActivity mainActivity);
    
    public abstract void injectFrag(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment);
}