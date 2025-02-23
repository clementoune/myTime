package com.example.infomobile.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.infomobile.presentation.components.RoutineCard
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ListRoutineScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE3F3D2))
    ) {
        Box(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("myTime", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xFF315A39))
        }

        Button(
            onClick = { navController.navigate("addRoutine") },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB1DD9E), contentColor = Color(0xFF315A39)),
            shape = RoundedCornerShape(8.dp),

        ) {
            Text("+ Ajouter une routine", color = Color(0xFF315A39))
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(modifier = Modifier.weight(1f).padding(horizontal = 16.dp)) {
            routines.forEach { routine ->
                item {
                    RoutineCard(routine)
                }
            }
        }
    }
}