package com.shirleen.chamaapp.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shirleen.chamaapp.ui.screens.dashboards.AdminDashboardScreen
import com.shirleen.chamaapp.ui.screens.dashboards.MemberDashboardScreen
import com.shirleen.chamaapp.ui.screens.splashscreen.SplashScreen

@Composable

fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ADMIN_DASHBOARD,

    ){
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination,

        ) {

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_ADMIN_DASHBOARD) {
            AdminDashboardScreen(navController)
        }

        composable(ROUT_MEMBER_DASHBOARD) {
            MemberDashboardScreen(navController)
        }

    }
}