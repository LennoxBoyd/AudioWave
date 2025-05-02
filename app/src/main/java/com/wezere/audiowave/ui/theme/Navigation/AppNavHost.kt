package com.wezere.audiowave.ui.theme.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wezere.audiowave.ui.theme.Screens.Login.Login_Screen
import com.wezere.audiowave.ui.theme.Screens.Onboard.Onboard_Screen
import com.wezere.audiowave.ui.theme.Screens.Register.Register_Screen

@Composable
fun AppNavHost(modifier: Modifier= Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String=ROUTE_ONBOARD
               ) {
    NavHost(navController = navController,
        modifier = modifier,
        startDestination = startDestination){
        composable (ROUTE_ONBOARD){
            Onboard_Screen(navController)
        }
        composable (ROUTE_LOGIN){
            Login_Screen(navController)
        }
        composable ( ROUTE_REGISTER ){
            Register_Screen(navController)
        }

    }

}








