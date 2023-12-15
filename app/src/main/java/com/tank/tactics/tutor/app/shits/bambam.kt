package com.tank.tactics.tutor.app.shits

import android.view.MotionEvent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tank.tactics.tutor.app.R
import com.tank.tactics.tutor.app.ui.theme.Black

@Composable
fun backich(imagePainter: Int)
{
    Image(painter = painterResource(id = imagePainter) , contentDescription ="",
        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
}

@Composable
fun Textoid(text: String, size:Int, modifier: Modifier, color: Color)
{
    Box(modifier = modifier)
    {
        Text(text = text, fontSize = size.sp, color = Black,
        fontFamily =  FontFamily(Font(R.font.bim)),
        modifier = Modifier.offset(-1.dp,-1.dp)
    )
        Text(text = text, fontSize = size.sp, color = Black,
            fontFamily =  FontFamily(Font(R.font.bim)),
            modifier = Modifier.offset(1.dp,1.dp)
        )
        Text(text = text, fontSize = size.sp, color = color,
            fontFamily =  FontFamily(Font(R.font.bim)),
        )
    }

}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Buton(modifier: Modifier = Modifier,wtd:()->Unit, soderz: @Composable ()->Unit)
{
    val scaleAni= remember {
        mutableStateOf(1f)
    }
    Box(modifier = modifier.then(Modifier.scale(scaleAni.value))
        .pointerInteropFilter {
            when(it.action)
            {
                MotionEvent.ACTION_DOWN ->
                {
                    scaleAni.value = 0.5f
                }
                MotionEvent.ACTION_UP ->
                {
                    scaleAni.value = 1f
                    wtd.invoke()
                }

                else -> {}
            }
            true
        }
        )
    {
        soderz.invoke()
    }
}