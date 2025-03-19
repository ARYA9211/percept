package com.example.perception.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NewHomeScreen(onStartAR: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onStartAR,
            modifier = Modifier.size(200.dp)
        ) {
            Text(text = "Start AR Scan")
        }
    }
}
//
//
//package com.example.perception.ui.screens
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//
//@Composable
//fun NewHomeScreen(navController: NavController) {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Button(
//            onClick = { navController.navigate(ViewScreen) }, // Navigate to ViewScreen
//            modifier = Modifier.size(200.dp)
//        ) {
//            Text(text = "Start AR Scan")
//        }
//    }
//}
