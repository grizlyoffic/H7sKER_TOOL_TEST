package com.nexbytes.h7skertool.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    titleLarge = TextStyle(FontFamily.Default, FontWeight.Bold, 22.sp, 28.sp),
    titleMedium = TextStyle(FontFamily.Default, FontWeight.SemiBold, 16.sp, 24.sp),
    titleSmall = TextStyle(FontFamily.Default, FontWeight.SemiBold, 14.sp, 20.sp),
    bodyLarge = TextStyle(FontFamily.Default, FontWeight.Normal, 16.sp, 24.sp),
    bodyMedium = TextStyle(FontFamily.Default, FontWeight.Normal, 14.sp, 20.sp),
    bodySmall = TextStyle(FontFamily.Monospace, FontWeight.Normal, 12.sp, 18.sp),
    labelLarge = TextStyle(FontFamily.Default, FontWeight.Medium, 14.sp, 20.sp),
    labelMedium = TextStyle(FontFamily.Monospace, FontWeight.Medium, 12.sp, 16.sp),
    labelSmall = TextStyle(FontFamily.Monospace, FontWeight.Normal, 11.sp, 14.sp),
)
