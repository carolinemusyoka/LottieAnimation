package com.carolmusyoka.lottieanimation.ui.onboarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.carolmusyoka.lottieanimation.R
import com.carolmusyoka.lottieanimation.ui.onboarding.entity.OnboardingPage
import kotlinx.android.synthetic.main.onboarding_page_item.view.*

class OnBoardingPagerAdapter(private val onBoardingPageList:Array<OnboardingPage> = OnboardingPage.values())
    : RecyclerView.Adapter<PagerViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PagerViewHolder {
        return LayoutInflater.from(parent.context).inflate(
            PagerViewHolder.LAYOUT, parent, false
        ).let { PagerViewHolder(it) }
    }

    override fun getItemCount() = onBoardingPageList.size

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bind(onBoardingPageList[position])
    }
}

class PagerViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {
    fun bind(onBoardingPage: OnboardingPage) {
        val res = root.context.resources
        root.titleTv?.text = res.getString(onBoardingPage.titleResource)
        root.subTitleTv?.text = res.getString(onBoardingPage.subTitleResource)
        root.descTV?.text = res.getString(onBoardingPage.descriptionResource)
            // root.img.setImageResource(onBoardingPage.logoResource)
        root.img.setAnimation(onBoardingPage.logoResource)
        root.img. playAnimation()

    }

    companion object {
        @LayoutRes
        val LAYOUT = R.layout.onboarding_page_item
    }
}
