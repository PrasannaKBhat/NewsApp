package com.loc.newsapp.presentation.onboarding

//Send events from ui to viewmodel
sealed class OnBoardingEvent {
    object SaveAppEntry : OnBoardingEvent()
}