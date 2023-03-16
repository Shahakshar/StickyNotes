package com.example.notes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Teal200,
    onPrimary = Color.Black,
    background = Color.White,
    onBackground = Color.Black,
    surface = LightBlue,
    onSurface = Color.Red
)

private val LightColorPalette = lightColors(

    primary = Teal200,
    onPrimary = Color.Black,
    background = Color.White,
    onBackground = Color.Black,
    surface = LightBlue,
    onSurface = Color.Red

)

@Composable
fun NoteAppCleanArchitectureTheme(
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