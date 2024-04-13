package com.example.beautifulapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip(
    @DrawableRes val imageResourceId: Int,
    @StringRes val number: Int,
    @StringRes val title: Int,
    @StringRes val description: Int
)

val tips = listOf(
    Tip(R.drawable.inuyashapfpsfiltered50, R.string.art_tip_1, R.string.tip_name_1, R.string.art_tip_description_1),
    Tip(R.drawable.raelee, R.string.art_tip_2, R.string.tip_name_2, R.string.art_tip_description_2),
    Tip(R.drawable.tennismk, R.string.art_tip_3, R.string.tip_name_3, R.string.art_tip_description_3),
    Tip(R.drawable.killjoyiconexclamation, R.string.art_tip_4, R.string.tip_name_4, R.string.art_tip_description_4),
    Tip(R.drawable.flowerpowersolace, R.string.art_tip_5, R.string.tip_name_5, R.string.art_tip_description_5),
    Tip(R.drawable.sovayap, R.string.art_tip_6, R.string.tip_name_6, R.string.art_tip_description_6),
    Tip(R.drawable.mymomrobin, R.string.art_tip_7, R.string.tip_name_7, R.string.art_tip_description_7)
)
