package com.zuhriyansauqi.materialnote.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkCharcoal,
    primaryVariant = ChineseBlack,
    secondary = SlateGray,
    background = ChineseBlack,
    surface = ChineseBlack,
    onPrimary = GhostWhite,
    onSecondary = White,
    onBackground = GhostWhite,
    onSurface = GhostWhite
)

private val LightColorPalette = lightColors(
    primary = White,
    primaryVariant = GhostWhite,
    secondary = SlateGray,
    background = GhostWhite,
    surface = GhostWhite,
    onPrimary = ChineseBlack,
    onSecondary = White,
    onBackground = ChineseBlack,
    onSurface = ChineseBlack
)

@Composable
fun MaterialNoteTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}