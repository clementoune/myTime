package com.example.infomobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.infomobile.presentation.AddRoutineScreen
import com.example.infomobile.presentation.ListRoutineScreen
import com.example.infomobile.ui.theme.InfoMobileTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InfoMobileTheme {
                Scaffold(modifier = Modifier.fillMaxSize().background(color = Color(0xFFE3F3D2))) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "routineList") {
                        composable("routineList") { ListRoutineScreen(innerPadding, navController) }
                        composable("addRoutine") { AddRoutineScreen(navController) }
                    }
                }
            }
        }
    }
}

/*Fait en suivant le diapo du prof
sealed class Screen(val route: String) {
    data object ListRoutineScreen : Screen(route = "list_routine_screen")
    data object AddRoutineScreen : Screen(route = "add_routine_screen")
}*/