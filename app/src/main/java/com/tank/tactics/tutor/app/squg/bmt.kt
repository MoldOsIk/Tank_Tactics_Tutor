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
fun bmt(back:()->Unit, gMen:()->Unit) {

    val zgjfdkgjdf = LocalConfiguration.current.screenHeightDp
    val iygf = LocalConfiguration.current.screenWidthDp
    val khgf = remember {listOf(
        R.drawable.bmt1,
        R.drawable.bmt2,
        R.drawable.bmt3,
        R.drawable.bmt4,
        R.drawable.bmt5,
    )}

    val gfdi = remember{
        listOf(
            "multifunctional tank Cromwell A24.\nCromwell is a light medium tank. Without armor, " +
                    "high DPM, very high speed, good camouflage is one of its best characteristics.\n" +
                    "With Cromwell you can easily outflank your enemies.\nCan also be used as a sniper, " +
                    "but stabilization and aiming time are not suitable for this mission.\nWith this tank, " +
                    "don't go head-on, wait for the tank to show the enemy's position, use mobility to " +
                    "occupy the flanks. Are enemies approaching? Run away, don't let them get closer.\nNever " +
                    "trust your armor! Use mobility instead of armor.",
            "Tier VII mobile sniper tank. With German precision, the 75mm cannon does not cause huge damage " +
                    "(alpha damage 135 hp).\nHis armor appears thick, but is useless. Don't " +
                    "go to the front line.\nFrontal shots can damage the engine, so take cover as best you can. " +
                    "Ammunition is also vulnerable. Because it's a German tank\nIts gun with an armor penetration " +
                    "of 198 mm is capable of penetrating even Tier IX guns. For levels VI and VII, his armor can" +
                    " tank something.",
            "With good accuracy, and good uvn, you can become the king of the hill.\nUse your mobility to get " +
                    "into positions faster. The turret armor is excellent\nDon't use hull armor. Having a well-armored" +
                    " turret can leave you disappointed. He's so weak. Most enemies can easily penetrate the hull. There " +
                    "is an ammunition rack next to the mechanic, a frontal penetration can damage this module.\nAt long " +
                    "distances the Centurion is also good. Its cannon can withstand all Tier VIII projectiles. With a" +
                    " wide range of vision, you can engage the enemy without being noticed.",
            "Level 9 nasty element Udes 16 has strange gameplay. Fast and furious, this Swedish medium tank is designed " +
                    "for close to mid-range combat and can be a game changer if you play it right.\nIn statistics, " +
                    "the armor is too weak. Its 70mm armor can increase its effectiveness to 300mm. Almost " +
                    "invulnerable.\nThanks to its high camouflage value, it can be used as a sniper. High DPM will " +
                    "be useful for this mission.\nPenetration is not the best for its level, but it can withstand" +
                    " most Tier X tanks. It is very important to know the enemy's weak points.\nWith the Udes " +
                    "16, quickly take position, hide the body, use hydropneumatic suspension.",
            "The heaviest medium tank in the game. A terrible element for the enemy team. With all the perfection of " +
                    "Stalin.\nWith an almost invulnerable turret and excellent hull armor, the 430u can withstand" +
                    " any enemy shells.\nIts 122mm gun can punch through enemies if you know where to shoot " +
                    "with 440hp alpha damage. Don't try to be a sniper with this gun; if the stub is bad, you'll miss. " +
                    "With 5-degree angles you won't be able to work on hills.\nIts mobility is a little worse than other" +
                    " Tier X medium tanks due to its excellent armor, so that's acceptable. Can fight heavy tanks and support " +
                    "medium tanks.\nAbout the 430u Multi-role fighter is one of the most powerful tanks in the game.",
        )
    }
    val l2 = remember {
        listOf(
            "Cromwell",
            "Panther",
            "Centurion",
            "Udes 16",
            "Object 430U",
        )
    }
    var indexich = remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxSize())
    {
        backich(imagePainter = R.drawable.bmtbg,)
        Buton(wtd = {
            if(indexich.value!=0)
            {
                indexich.value = (indexich.value-1)%khgf.size
            }
            else
            {
                back.invoke()
            } }, modifier = Modifier
            .padding(start = (iygf*0.05).dp, top = (zgjfdkgjdf*0.045).dp)) {
            Image(painter = painterResource(id = R.drawable.backbutton),
                contentDescription ="",
            )
        }

        AnimatedContent(targetState =indexich.value, label = "", transitionSpec ={
            (fadeIn(animationSpec = tween(220, delayMillis = 0)) +
                    scaleIn(initialScale = 0.92f, animationSpec = tween(220, delayMillis = 0)))
                .togetherWith(fadeOut(animationSpec = tween(0)))
        }, modifier = Modifier
            .align(Alignment.Center)
            .padding(top = 5.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally)

            {
                Textoid(text = l2[indexich.value], size = 21, modifier = Modifier , color = White)
                Image(painter = painterResource(id = khgf[indexich.value]), contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(), contentScale = ContentScale.FillBounds)
                Box(modifier = Modifier
                    .padding((zgjfdkgjdf * 0.01).dp)
                    .size(width = (iygf * 0.9).dp, height = (zgjfdkgjdf * 0.45).dp))
                {
                    LazyColumn() {
                        item{
                            Textoid(text = gfdi[it], size =24 , modifier = Modifier , color = White)
                        }

                    }
                }
            }

        }

        if(indexich.value!==4) {
            Buton(wtd = { indexich.value = (indexich.value+1)%khgf.size}, modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = (zgjfdkgjdf * 0.03).dp)) {
                Image(painter = painterResource(id = R.drawable.nextbutton), contentDescription ="", modifier = Modifier
                    .size(height = (zgjfdkgjdf*0.1).dp, width = (iygf*0.35).dp))
            }
        }
        else {
            Buton(wtd = { gMen.invoke()}, modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = (zgjfdkgjdf * 0.03).dp)) {
                Image(painter = painterResource(id = R.drawable.tomenubutton), contentDescription ="", modifier = Modifier
                    .size(height = (zgjfdkgjdf*0.1).dp, width = (iygf*0.35).dp))
            }
        }

    }
    BackHandler {
        if(indexich.value!=0)
        {
            indexich.value = (indexich.value-1)%khgf.size
        }
        else
        {
            back.invoke()
        }
    }
}