package com.example.ca2final.ca2finalpac

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navigate(){
    val nav = rememberNavController()

    NavHost(
        navController = nav,
        startDestination = "login"
    ){
        composable("login"){
            loginn(nav)
        }
        composable("home"){
            homee(nav)
        }

    }
}