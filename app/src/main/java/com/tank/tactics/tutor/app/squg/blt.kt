package com.tank.tactics.tutor.app.squg

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tank.tactics.tutor.app.R
import com.tank.tactics.tutor.app.shits.Buton
import com.tank.tactics.tutor.app.shits.Textoid
import com.tank.tactics.tutor.app.shits.backich
import com.tank.tactics.tutor.app.ui.theme.White

@Composable
fun blt(back:()->Unit, gMen:()->Unit) {

    val utyhgf = LocalConfiguration.current.screenHeightDp
    val ohgf = LocalConfiguration.current.screenWidthDp
    val whattankich = remember {listOf(
        R.drawable.blt1,
        R.drawable.blt2,
        R.drawable.blt3,
        R.drawable.blt4,
        R.drawable.blt5,
    )}

    val gfdi = remember{
        listOf(
            "The first ltvod on the list is French. In principle, it is good as a kind of st and lt. That is, " +
                    "ideally, it is capable of destroying the enemy’s armor in close combat. Due to the drum, " +
                    "it is also useful for the team. It can do a lot on city maps, unlike other lts. But if we are " +
                    "talking about active light, as ebr does, for example, t100, 13 105 are a little in the wrong rut. " +
                    "He doesn't have the mobility to do this. Passive light, sometimes active. But doing active light too " +
                    "often is risky. You can be outplayed by a fucker.",
            "An interesting tank, but rather weak as a lt. Too big to actively shine. The risk is high. If we want to" +
                    " shine, then EBR is, of course, generally top 1. But EBR loses in terms of DPM. And on some RHM shrek or" +
                    " 13 105 it’s easier to give quick damage.\nIn my opinion, Sheridan is something exotic. He supposedly " +
                    "has a landmine for 900 damage, but everything is also random there. You can, of course, give a poke to " +
                    "a little girl under 900, but you’ll have to try. And who told you that the LT will stand still?",
            "Interesting light in the form of passive light. A bit like a Christmas tree. The truth is that it is weak in " +
                    "close combat. Loses ebru, t100lt, as well as 13,105 in melee damage. Not an alpha strike, but if " +
                    "there is a long battle. The gun's CD is sad. For those who like to rat directly, it is ideal. For " +
                    "those who like a more vigorous rubilovo, it is better to take ebr or t100lt. Even Shrek will be more" +
                    " interesting. Still, the rifleman shoots more accurately and the gun fires faster",
            "The funniest LT among all. Shrekich, with top down in terms of accuracy and stability. The mixing " +
                    "is also normal. The only thing that infuriates me is the size of the tank + the lack of armor" +
                    " standards, like the T100lt. Shrek is something exotic again. As lt, in my opinion, not very good." +
                    " It's too easy to fall into. And in terms of dynamics, it’s not particularly competitive with other " +
                    "tanks. The choice is obvious - for experienced pilots.",
            "The most imbalanced LT among all. A wheeled monster that flies " +
                    "94 km from the field. Very wild light in the form of active light. " +
                    "In addition to all this, there is an alpha strike of 390 damage and a " +
                    "quick reduction with an accuracy of 0.35 without any bonuses. Also a good" +
                    " option as a damage dealer if you stick the equipment under the city. The CD can be" +
                    " 9-10 seconds with an alpha of 390. This is no help at all. Overall, the best leader " +
                    "among all. Then comes t100lt. EBR is still more interesting due to the variability of the game. "
        )
    }
    val tankich = remember {
        listOf(
            "AMX 13 105",
            "Sheridan",
            "Manticore",
            "Rhm Pzw",
            "EBR 105",
        )
    }
    var imgnd = remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxSize())
    {
        backich(imagePainter = R.drawable.bltbg,)
        Buton(wtd = {
            if(imgnd.value!=0)
            {
                imgnd.value = (imgnd.value-1)%whattankich.size
            }
            else
            {
                back.invoke()
            } }, modifier = Modifier
            .padding(start = (ohgf*0.05).dp, top = (utyhgf*0.045).dp)) {
            Image(painter = painterResource(id = R.drawable.backbutton),
                contentDescription ="",
            )
        }

        AnimatedContent(targetState =imgnd.value, label = "", transitionSpec ={
            (fadeIn(animationSpec = tween(220, delayMillis = 0)) +
                    scaleIn(initialScale = 0.92f, animationSpec = tween(220, delayMillis = 0)))
                .togetherWith(fadeOut(animationSpec = tween(0)))
        }, modifier = Modifier
            .align(Alignment.Center)
            .padding(top = 5.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally)

            {
                    Textoid(text = tankich[imgnd.value], size = 21, modifier = Modifier , color = White)
                Image(painter = painterResource(id = whattankich[imgnd.value]), contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(), contentScale = ContentScale.FillBounds)
                Box(modifier = Modifier
                    .padding((utyhgf * 0.01).dp)
                    .size(width = (ohgf * 0.9).dp, height = (utyhgf * 0.5).dp))
                {
                    LazyColumn() {
                        item{
                            Textoid(text = gfdi[it], size =24 , modifier = Modifier , color = White)
                        }

                    }
                }
            }

        }


        if(imgnd.value!==4)
        {
            Buton(wtd = { imgnd.value = (imgnd.value+1)%whattankich.size}, modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = (utyhgf * 0.03).dp)) {
                Image(painter = painterResource(id = R.drawable.nextbutton), contentDescription ="", modifier = Modifier
                    .size(height = (utyhgf*0.1).dp, width = (ohgf*0.35).dp))
            }
        }
        else {
            Buton(wtd = { gMen.invoke()}, modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = (utyhgf * 0.03).dp)) {
                Image(painter = painterResource(id = R.drawable.tomenubutton), contentDescription ="", modifier = Modifier
                    .size(height = (utyhgf*0.1).dp, width = (ohgf*0.35).dp))
            }
        }

    }
    BackHandler {
        if(imgnd.value!=0)
        {
            imgnd.value = (imgnd.value-1)%whattankich.size
        }
        else
        {
            back.invoke()
        }
    }
}