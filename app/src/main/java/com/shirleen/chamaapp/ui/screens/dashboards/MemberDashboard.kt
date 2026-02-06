package com.shirleen.chamaapp.ui.screens.dashboards

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MemberDashboardScreen(navController: NavController){}

@Preview(showBackground = true)
@Composable
fun MemberDashboardScreenPreview() {
    MemberDashboardScreen(rememberNavController())
}