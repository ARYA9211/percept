//package com.example.perception.ui.navigation
//
////package com.example.myapplication.navigation
//
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.example.perception.ui.screens.*
//
//import com.example.perception.ui.screens.SettingsScreen
//import com.example.perception.ui.screens.NewHomeScreen
//
//@Composable
//fun NavigationGraph(
//    navController: NavHostController,
//    paddingValues: PaddingValues,
//    darkMode: Boolean,
//    onThemeChange: (Boolean) -> Unit
//) {
//    NavHost(navController, startDestination = "home") {
//        composable("home") { NewHomeScreen { navController.navigate("ar") } } // Navigate to AR screen
//        composable("browse") { BrowseScreen() }
//        composable("saved") { SavedScreen() }
//        composable("settings") { SettingsScreen(darkMode, onThemeChange) }
//        composable("ar") { ARScreen() }  // Added ARScreen
//    }
//}

//package com.example.perception.ui.navigation
//
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.example.perception.ui.screens.*
//import com.example.perception.ui.screens.SettingsScreen
//import com.example.perception.ui.screens.NewHomeScreen
//
//@Composable
//fun NavigationGraph(
//    navController: NavHostController,
//    paddingValues: PaddingValues,
//    darkMode: Boolean,
//    onThemeChange: (Boolean) -> Unit
//) {
//    NavHost(navController, startDestination = "home") {
//        composable("home") {
//            NewHomeScreen(onStartAR = { navController.navigate("view") })
//        }
//        composable("browse") { BrowseScreen() }
//        composable("saved") { SavedScreen() }
//        composable("settings") { SettingsScreen(darkMode, onThemeChange) }
//        composable("view") { ViewScreen(navController) } // Ensure correct navigation here
////        composable("ar") { ARScreen() }
////        composable("ar") { ARScreeen() }
//    }
//}


package com.example.perception.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.perception.ui.screens.*
import com.example.perception.ui.screens.SettingsScreen
import com.example.perception.ui.screens.NewHomeScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    paddingValues: PaddingValues,
    darkMode: Boolean,
    onThemeChange: (Boolean) -> Unit
) {
    NavHost(navController, startDestination = "home") {
        composable("home") {
            NewHomeScreen(onStartAR = { navController.navigate("view") })
        }
        composable("browse") { BrowseScreen() }
        composable("saved") { SavedScreen() }
        composable("settings") { SettingsScreen(darkMode, onThemeChange) }
        composable("view") { ViewScreen(navController) } // View Screen
        composable("ar/{model}") { backStackEntry ->
            val modelPath = backStackEntry.arguments?.getString("model") ?: ""
            ARScreeen(modelPath)
        }
    }
}

