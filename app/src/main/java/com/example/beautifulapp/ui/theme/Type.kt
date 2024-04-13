package com.example.beautifulapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.beautifulapp.R

val FairyRose = FontFamily(
    Font(R.font.fairyrose)
)

val JosefinSans = FontFamily(
    Font(R.font.josefinsans_regular)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = FairyRose,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp
    ),
    displayMedium = TextStyle(
        fontFamily = FairyRose,
        fontWeight = FontWeight.Normal,
        fontSize = 29.sp
    ),
    displaySmall = TextStyle(
        fontFamily = JosefinSans,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp
    )
)