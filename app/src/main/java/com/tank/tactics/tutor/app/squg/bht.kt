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
fun bht(back:()->Unit,gMen:()->Unit) {

    val zgjfdkgjdf = LocalConfiguration.current.screenHeightDp
    val jgzgjkfgd = LocalConfiguration.current.screenWidthDp
    val khgf = remember {listOf(
        R.drawable.bht1,
        R.drawable.bht2,
        R.drawable.bht3,
        R.drawable.bht4,
        R.drawable.bht5,
    )}

    val te = remember{
        listOf(
            "This mastodon is intended primarily for those who are not in a hurry. And what? There is armor, there is also a good weapon, and the tank is slow, but it has a lot of HP. If you go to a position with other tanks and don’t expose yourself too much, then the tank can do a good job of showing its power. The main thing for this tank is not to be left alone in a position, since, due to its clumsiness, faster tanks can spin it.\nPros: There is armor, alpha is 750, a lot of HP, good penetration by gold shells.\nCons: Large tank size, slowness, mediocre accuracy of the top gun.\nConclusion: To understand a tank, you need to play with it; it has both pros and cons. It belongs to the super-heavy tanks and it’s up to you to upgrade it or not, but I would leave it in the hangar, sometimes it’s great to play on it.",
            "Another representative of super-heavy tanks. You can treat it however you like, but you definitely can’t call it a bad tank. This is a tank of mood and a tank that plays well on urban maps and suffers on open maps. It is armored, has an excellent alpha of 650 and more or less normal penetration of 256/317. Accuracy, of course, is not an acquired taste, but I hit the hatches from quite a distance. The tank lacks dynamics, so you can safely install a turbocharger on it.\nPros: Armor, decent one-time damage, armor penetration.\nCons: Clumsy, long mixing, vulnerability of bk.\nConclusion: This tank is definitely not bad, in some battles it drags, and in others it is almost useless. Very dependent on cards, but in general it is suitable for most players who do not aim to be extras.",
            "The Polish, super-heavy, is very similar to the Soviet one about 705A, the difference is in different turret locations and even small differences. It has good armor, a gun with an alpha of 750 and average penetration with a regular projectile. Also, the tank has a good margin of safety. In the game, it is similar to other slow tanks, which makes this tank dependent on allies.\nPros: Armor, safety margin, one-time damage.\nCons: Slow, mediocre accuracy, many weak spots.\nConclusion: A tank that may appeal to some and not appeal to others at all. The tank is not for everyone, the game is mainly played from cover, where you need to hide your hull.",
            "A good old man, a tank that most people have in their hangar. I won’t talk much about it, I’ll just say that the tank is universal, a classic TT with a strong turret. This tank is average in everything, it has average penetration, average alpha, average armor, average speed. But with all this, the tank is ideal for novice tankers, since it does not require certain skills in the game.\nPros: Mobility, turret and hull armor, damage per shot, low silhouette.\nCons: Accuracy, poor penetration by conventional shells, long aiming time.\nConclusion: Well suited for those who have just started playing and are mastering the game on TT. Easy to control and play.",
            "Once upon a time, he had a strong tower, until they learned how to pierce it into the roof, mask and turret, but even then, many still do not know how to pierce a conic into a tower. The tank is easy to control, it doesn’t go fast, but you can’t call it slow either, the one-time damage is small, but reloading is good. Penetration is normal, but it is better to carry gold. The main thing I love about this tank is its accuracy, which allows you to target weak areas of your opponent. Stand behind cover and shoot little by little. I think this tank is completely suitable for both beginners and experienced players.\nPros: Gun accuracy, strong turret, UV, stabilization.\nCons: Dynamics, one-time damage, frequent crits of ammunition.\nConclusion: You need to get used to this tank, run it in, then you will understand for yourself where the tank’s weak and strong sides are. I definitely recommend it to all players.",
        )
    }
    val fdg = remember {
        listOf(
            "Е 100",
            "Object 705A",
            "60TP Lewandowskiego",
            "IS-7",
            "Super Conqueror",
        )
    }
    var imgInx = remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxSize())
    {
        backich(imagePainter = R.drawable.bhtbg,)
        Buton(wtd = {
            if(imgInx.value!=0)
            {
                imgInx.value = (imgInx.value-1)%khgf.size
            }
            else
            {
                back.invoke()
            } }, modifier = Modifier
            .padding(start = (jgzgjkfgd*0.05).dp, top = (zgjfdkgjdf*0.045).dp)) {
            Image(painter = painterResource(id = R.drawable.backbutton),
                contentDescription ="",
            )
        }

        AnimatedContent(targetState =imgInx.value, label = "", transitionSpec ={
            (fadeIn(animationSpec = tween(220, delayMillis = 0)) +
                    scaleIn(initialScale = 0.92f, animationSpec = tween(220, delayMillis = 0)))
                .togetherWith(fadeOut(animationSpec = tween(0)))
        }, modifier = Modifier
            .align(Alignment.Center)
            .padding(top = 5.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally)

            {
                Textoid(text = fdg[imgInx.value], size = 21, modifier = Modifier , color = White)
                Image(painter = painterResource(id = khgf[imgInx.value]), contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(), contentScale = ContentScale.FillBounds)
                Box(modifier = Modifier
                    .padding((zgjfdkgjdf * 0.01).dp)
                    .size(width = (jgzgjkfgd * 0.9).dp, height = (zgjfdkgjdf * 0.45).dp))
                {
                    LazyColumn() {
                        item{
                            Textoid(text = te[it], size =24 , modifier = Modifier , color = White)
                        }

                    }
                }
            }

        }


        if(imgInx.value!==4)
        {
            Buton(wtd = { imgInx.value = (imgInx.value+1)%khgf.size}, modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = (zgjfdkgjdf * 0.03).dp)) {
                Image(painter = painterResource(id = R.drawable.nextbutton), contentDescription ="", modifier = Modifier
                    .size(height = (zgjfdkgjdf*0.1).dp, width = (jgzgjkfgd*0.35).dp))
            }
        }
        else {
            Buton(wtd = { gMen.invoke()}, modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = (zgjfdkgjdf * 0.03).dp)) {
                Image(painter = painterResource(id = R.drawable.tomenubutton), contentDescription ="", modifier = Modifier
                    .size(height = (zgjfdkgjdf*0.1).dp, width = (jgzgjkfgd*0.35).dp))
            }
        }

    }
    BackHandler {
        if(imgInx.value!=0)
        {
            imgInx.value = (imgInx.value-1)%khgf.size
        }
        else
        {
            back.invoke()
        }
    }
}