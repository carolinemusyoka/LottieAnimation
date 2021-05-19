package com.carolmusyoka.lottieanimation.ui.onboarding.entity

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.carolmusyoka.lottieanimation.R

enum class OnboardingPage(
    @StringRes val titleResource: Int,
    @StringRes val subTitleResource: Int,
    @StringRes val descriptionResource: Int,
    @DrawableRes val logoResource: Int
) {

    ONE(R.string.onboarding_slide1_title, R.string.onboarding_slide1_subtitle,R.string.onboarding_slide1_desc, R.raw.comp),
    TWO(R.string.onboarding_slide2_title, R.string.onboarding_slide1_subtitle,R.string.onboarding_slide1_desc, R.raw.jump),
    THREE(R.string.onboarding_slide3_title, R.string.onboarding_slide1_subtitle,R.string.onboarding_slide1_desc, R.raw.cycling)

}