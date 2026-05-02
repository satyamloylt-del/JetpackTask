package com.example.jetpacktask.ui.screen.mainscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpacktask.common.bottomscreen.BottomNavBar
import com.example.jetpacktask.common.bottomscreen.Screen
import com.example.jetpacktask.ui.screen.home.HomeScreen
import com.example.jetpacktask.ui.screen.labtest.LabTestScreen

@Composable
fun MainScreen(){

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomNavBar(navController)
    }) {padding->
        NavHost(
            navController = navController,
            startDestination = Screen.LabTest.route,
            modifier = Modifier.padding(padding)
        ) {
            composable(Screen.Home.route){
                HomeScreen()
            }
            composable(Screen.Reports.route){}
            composable(Screen.LabTest.route){
                LabTestScreen()
            }
            composable(Screen.Bookings.route){}
            composable(Screen.Profile.route){}
        }

    }
}