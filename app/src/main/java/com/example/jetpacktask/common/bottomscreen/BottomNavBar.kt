package com.example.jetpacktask.common.bottomscreen



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavBar(navController: NavHostController){


    val items = listOf(
        Screen.Home,
        Screen.Reports,
        Screen.LabTest,
        Screen.Bookings,
        Screen.Profile,
    )
    Column(modifier = Modifier.fillMaxWidth()) {
        HorizontalDivider(modifier = Modifier.background(color = Color.Cyan))
        NavigationBar(containerColor = Color.White) {
            val currentRoute=navController.currentBackStackEntryAsState().value?.destination?.route

            items.forEach { screen ->
                NavigationBarItem(
                    selected = currentRoute == screen.route,
                    onClick = {
                        navController.navigate(screen.route) {
                            popUpTo(Screen.LabTest.route)
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = screen.icon),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp),
                            tint = Color.Unspecified
                        )
                    },
                    label = {
                        Text(screen.title)
                    }
                )
            }
        }
    }

}