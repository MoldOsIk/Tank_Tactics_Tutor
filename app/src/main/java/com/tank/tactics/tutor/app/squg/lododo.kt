package com.tank.tactics.tutor.app.squg

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.tank.tactics.tutor.app.R
import com.tank.tactics.tutor.app.shits.Textoid
import com.tank.tactics.tutor.app.shits.backich
import com.tank.tactics.tutor.app.ui.theme.White

@Composable
fun lododo(gMen:()->Unit) {

    var forcivfri = remember { Animatable(0f) }


    val fh = LocalConfiguration.current.screenHeightDp
    val cel = remember {
        100f
    }
    LaunchedEffect(Unit) {
        forcivfri.animateTo(cel, tween(2000))
        gMen.invoke()
    }

    Box(modifier =Modifier.fillMaxSize() )
    {
        backich(imagePainter = R.drawable.loadbg)
        Textoid(text = "${forcivfri.value.toInt()}%", size = 30, modifier =Modifier.align(Alignment.Center)
            .padding(top =(fh*0.1).dp ), color = White)
    }
}