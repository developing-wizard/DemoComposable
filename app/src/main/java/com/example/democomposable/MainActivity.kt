package com.example.democomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()

        }
    }
}
@Preview(showSystemUi = true
)
@Composable
fun App(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LoginScreen") {
       composable(route = "ListView"){
           GetPreviewOfData()
       }
        composable(route = "LoginScreen"){
            LoginScreen(navController)
        }
        composable(route = "HomeScreen"){
            HomeScreen(navController)
       }
        composable(route = "ListViewScreen"){
            ListViewScreen(navController)
        }
        
    }
}

@Composable
fun LoginScreen(navController: NavHostController) {
    Button(onClick = {
        navController.navigate("HomeScreen")
    }) {
        Text(text = "Navigation to Home Screen")
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Button(onClick = {
        navController.navigate("ListViewScreen")
    }) {
        Text(text = "Navigation to ListViewScreen")
    }
}

@Composable
fun ListViewScreen(navController: NavHostController) {
    Button(onClick = {
        navController.navigate("ListView")
    }) {
        Text(text = "Navigation to LISTS")
    }
}
