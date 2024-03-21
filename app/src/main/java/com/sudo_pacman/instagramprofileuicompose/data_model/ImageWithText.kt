package com.sudo_pacman.instagramprofileuicompose.data_model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter

data class ImageWithText(
    val image: Painter,
    val text: String
)