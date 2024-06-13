package core.presentation.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import core.presentation.theme.OM_Container
import core.presentation.util.OM_SemiBold

@Composable
fun OMButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(100),
        colors = ButtonDefaults.buttonColors(
            containerColor = OM_Container
        ),
        modifier = modifier
    ) {
        Text(
            text = text,
            fontFamily = OM_SemiBold,
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 12.dp)
        )
    }
}