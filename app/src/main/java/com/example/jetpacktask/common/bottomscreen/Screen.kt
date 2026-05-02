package com.example.jetpacktask.common.bottomscreen

import com.example.jetpacktask.R

sealed class Screen(val route: String, val title: String,val icon: Int) {

    object Home : Screen("HOME", "Home", R.drawable.home)
    object Reports : Screen("REPORTS", "Reports",R.drawable.reports)
    object LabTest : Screen("LABTEST", "Lab Test",R.drawable.labtest)
    object Bookings : Screen("BOOKINGS", "Bookings",R.drawable.bookings)
    object Profile : Screen("Profile", "Profile",R.drawable.profile)
}