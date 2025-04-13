package ca.dragonbyte.birds.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import ca.dragonbyte.birds.R

val Caveat = FontFamily(
    Font(R.font.caveat_semibold, FontWeight.Bold)
)

val NotoSans = FontFamily(
    Font(R.font.notosans_semibold, FontWeight.Bold),
    Font(R.font.notosans_italic, FontWeight.Normal,  FontStyle.Italic)
)

val CormorantGaramond=FontFamily(
    Font(R.font.cormorant_garamond_regular)
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineMedium = TextStyle(
        fontFamily = Caveat,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = NotoSans,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = NotoSans,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = CormorantGaramond,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
