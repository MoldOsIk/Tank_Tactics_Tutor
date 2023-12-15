package com.tank.tactics.tutor.app

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tank.tactics.tutor.app.shits.fornavik
import com.tank.tactics.tutor.app.squg.Gui
import com.tank.tactics.tutor.app.squg.bht
import com.tank.tactics.tutor.app.squg.blt
import com.tank.tactics.tutor.app.squg.bmt
import com.tank.tactics.tutor.app.squg.lododo
import com.tank.tactics.tutor.app.squg.men
import com.tank.tactics.tutor.app.ui.theme.TankTacticsTutorTheme

class TankActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        val wcc = WindowCompat.getInsetsController(window, window.decorView)
        wcc.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        wcc.hide(WindowInsetsCompat.Type.statusBars())
        WindowCompat.setDecorFitsSystemWindows(window,false)
        setContent {
            TankTacticsTutorTheme {

                val navik = rememberNavController()

                val ab = fornavik()
                NavHost(navController = navik, startDestination =ab.lOspl )
                {
                    composable(ab.lOspl)
                    {
                        lododo(gMen = {navik.navigate(ab.menchik)})
                    }
                    composable(ab.menchik)
                    {
                        men(gTf = {navik.navigate(ab.guI)},
                            gTs = {navik.navigate(ab.blt)},
                            gTt = {navik.navigate(ab.bmt)},
                            gTfo = {navik.navigate(ab.bht)})
                    }
                    composable(ab.guI)
                    {
                        Gui(back = {navik.popBackStack()},
                            gMen = {navik.navigate(ab.menchik)})
                    }
                    composable(ab.blt)
                    {
                        blt(back = {navik.popBackStack()},
                            gMen = {navik.navigate(ab.menchik)})
                    }
                    composable(ab.bmt)
                    {
                        bmt (back = {navik.popBackStack()},
                            gMen = {navik.navigate(ab.menchik)})
                    }
                    composable(ab.bht)
                    {
                        bht(back = {navik.popBackStack()},
                            gMen = {navik.navigate(ab.menchik)})
                    }
                }
            }
        }
    }
}
