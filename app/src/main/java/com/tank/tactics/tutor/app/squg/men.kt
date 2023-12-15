package com.tank.tactics.tutor.app.squg

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tank.tactics.tutor.app.R
import com.tank.tactics.tutor.app.shits.Buton
import com.tank.tactics.tutor.app.shits.backich

@Composable
fun men(gTf:()->Unit, gTs:()->Unit,gTt:()->Unit,gTfo:()->Unit) {

    val param = LocalContext.current as Activity

    val fh = LocalConfiguration.current.screenHeightDp

    val fw = LocalConfiguration.current.screenWidthDp
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        backich(imagePainter = R.drawable.menbg)

        Column(modifier = Modifier
            .align(Alignment.Center)
            .padding(top = (fh * 0.1).dp),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Buton(wtd = { gTf.invoke()}) {
                Image(painter = painterResource(id = R.drawable.gubutton), contentDescription ="",
                    modifier = Modifier.size(height = (fh*0.1).dp, width = (fw*0.5).dp))
            }
            Buton(wtd = { gTs.invoke()}) {
                Image(painter = painterResource(id = R.drawable.bltbutton), contentDescription ="",
                    modifier = Modifier.size(height = (fh*0.1).dp, width = (fw*0.5).dp))
            }
            Buton(wtd = { gTt.invoke()}) {
                Image(painter = painterResource(id = R.drawable.bmtbutton), contentDescription ="",
                    modifier = Modifier.size(height = (fh*0.1).dp, width = (fw*0.5).dp))
            }
            Buton(wtd = { gTfo.invoke() }) {
                Image(painter = painterResource(id = R.drawable.bhtbutton), contentDescription ="",
                    modifier = Modifier.size(height = (fh*0.1).dp, width = (fw*0.5).dp))
            }
            Buton(wtd = { param.finish()}) {
                Image(painter = painterResource(id = R.drawable.exitbutton), contentDescription ="",
                    modifier = Modifier.size(height = (fh*0.1).dp, width = (fw*0.5).dp))
            }

        }
    }
    BackHandler {

    }
}