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
fun Gui(back:()->Unit, gMen:()->Unit) {

    val fh = LocalConfiguration.current.screenHeightDp
    val fw = LocalConfiguration.current.screenWidthDp
    val imgeshechka = remember {listOf(
        R.drawable.guide1,
        R.drawable.guide2,
        R.drawable.guide3,
        R.drawable.guide4,
        R.drawable.guide5,
    )}

    val textoid = remember{
        listOf(
            "The World of tanks game was released more than 12 years ago, " +
                    "but new players continue to come to it. This article will help beginners understand " +
                    "the game and begin to improve their skills.\n" +
                    "1. Don't skip training.\nThe tutorial is the first thing you will " +
                    "encounter when entering the game. It will teach you basic shooting and" +
                    " movement skills, so I don't recommend skipping it. Also, after training, " +
                    "you will be able to receive rewards to accelerate further development. ",
            "2. Game settings\nSetting up the game correctly is one of the main aspects of a successful game. " +
                    "Let's go through all the settings sections.\n" +
                    "A game\nI recommend turning on the server sight, viewing circles, X-ray and vehicle display. " +
                    "Also enable all minimap functions and permanent display of its additional functions. " +
                    "And the last thing I would recommend setting up in this section is to disable all types of battles " +
                    "except standard battles because assault and counter battles are less balanced and less understandable " +
                    "to a beginner.\nGraphic arts\nIn this section, a lot depends on the power of your computer. " +
                    "For weak computers, I recommend setting the graphics to minimum; in this game, the quality of the " +
                    "graphics has virtually no effect on the skill. For powerful computers, I recommend setting the maximum " +
                    "possible settings while maintaining 60 fps, but I recommend reducing the grass, its quantity and quality " +
                    "to a minimum because grass can interfere with aiming",
            "Sound\nIn this section, everything is at your discretion, but I recommend setting up low frequency boost, " +
                    "this will make it easier for you to hear artillery shots and drive away in time.\n\nControl\n" +
                    "This section is also up to your taste, personally I play on standard settings.\n\nAim\n1. " +
                    "Arcade\nI highly recommend placing the gun marker with an armor penetration indicator, the rest is up to " +
                    "your taste.\n2. Sniper\nEverything here is the same as with an arcade sight.\n3. Artillery\n" +
                    "You can leave it as default.\n4. Stroke\nI recommend using a simplified outline, " +
                    "shooting area: texture; non-shooting zone: filling.",
            "3. Don't miss Tank Academy tasks\nAll Tank Academy missions bring generous rewards and help you learn the game. " +
                    "Upon completion, you will be able to get 3 excellent Tier 8 tanks for rent for 14 days.\n\n4. Perform LBZ." +
                    "\nRelatively simple tasks in the first campaign can give you nice rewards to speed up your progress. I" +
                    " recommend completing the tasks without distinction first in order to receive new rewards as quickly as" +
                    " possible. Then, if you wish, you can always return to performing any combat mission.\n\n5. " +
                    "Find a commander to complete the referral program\nIf you have an experienced friend, you can ask " +
                    "for his referral link and sign a contract with him. You can read more about this in one of my next articles. " +
                    "You can receive valuable rewards, and the main reward is a premium car of level 6-7 absolutely free.",
            "6. Don't upgrade many tanks at once.\nIt was because of this error that I could not get a level 10 tank for " +
                    "about a year, the gold standard of the started branches is 2-3 vehicles. This way you can get your " +
                    "first level 10 tank in less than 2 months.\n\n7. Do not upgrade complex " +
                    "tanks with the first branches.\nLearning to play complex taka is extremely difficult" +
                    " and is not suitable for a beginner. I recommend leveling up 5-6 simple tanks and only" +
                    " then taking a closer look at skill-dependent vehicles.\n\nThese tips won't make" +
                    " you a better player, but they will help you get started and improve your playing skills. " +
                    "Watch the video, read the guides and then you can start bending. Good luck on the battlefields, tankers!",
        )
    }
    var imgInx = remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxSize())
    {
        backich(imagePainter =R.drawable.guidbg,)
        Buton(wtd = {
            if(imgInx.value!=0)
        {
            imgInx.value = (imgInx.value-1)%imgeshechka.size
        }
        else
        {
            back.invoke()
        } }, modifier = Modifier
            .padding(start = (fw*0.05).dp, top = (fh*0.045).dp)) {
            Image(painter = painterResource(id = R.drawable.backbutton),
                contentDescription ="",
                 )
        }

        AnimatedContent(targetState =imgInx.value, label = "", transitionSpec ={
            (fadeIn(animationSpec = tween(220, delayMillis = 90)) +
                    scaleIn(initialScale = 0.92f, animationSpec = tween(220, delayMillis = 90)))
                .togetherWith(fadeOut(animationSpec = tween(90)))
        }, modifier = Modifier
            .align(Alignment.Center)
            .padding(top = 5.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally)

            {
                if(imgInx.value == 0)
                {
                    Textoid(text = "Where to start as a Wot newcomer in 2023", size = 21, modifier =Modifier , color = White)
                }
                Image(painter = painterResource(id = imgeshechka[imgInx.value]), contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(), contentScale = ContentScale.FillBounds)
                Box(modifier = Modifier
                    .padding((fh * 0.01).dp)
                    .size(width = (fw * 0.9).dp, height = (fh * 0.5).dp))
                {
                    LazyColumn() {
                        item{
                            Textoid(text = textoid[it], size =24 , modifier =Modifier , color = White)
                        }

                    }
                }
            }

        }

        if(imgInx.value!==4) {
            Buton(
                wtd = { imgInx.value = (imgInx.value + 1) % imgeshechka.size }, modifier = Modifier
                    .align(
                        Alignment.BottomCenter
                    )
                    .padding(bottom = (fh * 0.03).dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.nextbutton),
                    contentDescription = "",
                    modifier = Modifier
                        .size(height = (fh * 0.1).dp, width = (fw * 0.35).dp)
                )
            }
        }
        else
        {
            Buton(
                wtd = { gMen.invoke() }, modifier = Modifier
                    .align(
                        Alignment.BottomCenter
                    )
                    .padding(bottom = (fh * 0.03).dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tomenubutton),
                    contentDescription = "",
                    modifier = Modifier
                        .size(height = (fh * 0.1).dp, width = (fw * 0.35).dp)
                )
            }
        }
    }
    BackHandler {
        if(imgInx.value!=0)
        {
            imgInx.value = (imgInx.value-1)%imgeshechka.size
        }
        else
        {
            back.invoke()
        }
    }
}