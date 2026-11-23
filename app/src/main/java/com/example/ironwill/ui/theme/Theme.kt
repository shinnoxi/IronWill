package com.example.ironwill.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val IronWillColorScheme = darkColorScheme(
    primary = PrimaryBlue,
    onPrimary = TextPrimary,
    secondary = PrimaryBright,
    onSecondary = SurfaceFloor,
    tertiary = TertiaryGreen,
    onTertiary = SurfaceFloor,
    background = SurfaceFloor,
    onBackground = TextPrimary,
    surface = SurfaceFloor,
    onSurface = TextPrimary,
    surfaceVariant = SurfaceContainer,
    onSurfaceVariant = TextSecondary,
    surfaceContainerLowest = SurfaceFloor,
    surfaceContainerLow = SurfaceContainerLow,
    surfaceContainer = SurfaceContainer,
    surfaceContainerHigh = SurfaceContainerHigh,
    surfaceContainerHighest = SurfaceContainerHighest,
    error = ErrorRed,
    onError = SurfaceFloor
)

@Composable
fun IronWillTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = IronWillColorScheme,
        typography = Typography,
        content = content
    )
}