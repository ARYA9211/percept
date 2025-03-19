package com.example.perception

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
//import com.example.perception.ui.navigation.ARScreen
import com.example.perception.ui.navigation.ARScreeen
//import com.example.perception.ui.navigation.HomeScreen
import com.example.perception.ui.screens.NewHomeScreen
import com.example.perception.ui.navigation.ViewScreen
//import com.example.perception.ui.screens.ARScreen
import com.example.perception.ui.screens.ARScreeen
//import com.example.perception.ui.screens.HomeScreen
import com.example.perception.ui.screens.NewHomeScreen
import com.example.perception.ui.screens.ViewScreen
import com.example.perception.ui.theme.PerceptionTheme
import java.net.URLDecoder

//package com.example.myapplication

//import android.os.Bundle
//import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.perception.ui.navigation.BottomNavBar
import com.example.perception.ui.navigation.NavigationGraph
import com.example.perception.ui.screens.AppTheme  // Import custom theme



//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            PerceptionTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    val navController= rememberNavController()
////                    NavHost(navController=navController, startDestination = HomeScreen, modifier = Modifier.padding(innerPadding))
//                    NavHost(navController=navController, startDestination = NewHomeScreen, modifier = Modifier.padding(innerPadding))
//                    {
////                        composable<HomeScreen>
//                        composable<NewHomeScreen>
//                        {
////                            HomeScreen(navController)
//                            NewHomeScreen(navController)
//                        }
//                        composable(
////                            route = ARScreen.route,
//                            route = ARScreeen.route,
//                            arguments = listOf(
//                                navArgument("model") {
//                                    type = NavType.StringType
//                                }
//                            )
//                        ) { backStackEntry ->
//                            // Extract the model parameter from navigation arguments
//                            val modelPath = URLDecoder.decode(
//                                backStackEntry.arguments?.getString("model") ?: "",
//                                "UTF-8"
//                            )
//
//                            // Pass the actual model path to the ARScreen composable
////                            ARScreen(navController, modelPath)
//                            ARScreeen(navController, modelPath)
//                        }
//                        composable<ViewScreen>
//                        {
//                            ViewScreen(navController)
//                        }
//                    }
//                }
//            }
//        }
//    }
//}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    var darkMode by remember { mutableStateOf(false) }  // Manage Dark Mode state
    val navController = rememberNavController()

    AppTheme(darkTheme = darkMode) {  // Apply theme dynamically
        Scaffold(
            bottomBar = { BottomNavBar(navController) }
        ) { paddingValues ->
            NavigationGraph(navController, paddingValues, darkMode, onThemeChange = { darkMode = it })
        }
    }
}
