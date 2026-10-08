package com.example.filaatendimento.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = PrimariaLaranja,
    primaryContainer = PrimariaLaranjaClaro,
    background = FundoseSuperficies01,
    surface = FundoseSuperficies02,
    surfaceVariant = FundoseSuperficies03,
    onPrimary = Color.White,
    onBackground = Textos01,
    onSurface = Textos01,
    onSurfaceVariant = Textos03,
    error = Erro
)

@Composable
fun FilaAtendimentoTheme(
    content: @Composable () -> Unit
) {
    val AppTypography: Typography = null
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = AppTypography,
        content = content
    )
}