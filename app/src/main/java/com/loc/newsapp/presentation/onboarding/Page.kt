package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Onboarding 1",
        description = "Onboarding description 1",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Onboarding 2",
        description = "Onboarding description 2",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Onboarding 3",
        description = "Onboarding description 3",
        image = R.drawable.onboarding1
    )
)