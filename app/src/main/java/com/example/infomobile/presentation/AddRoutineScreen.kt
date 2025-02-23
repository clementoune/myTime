package com.example.infomobile.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun AddRoutineScreen(navController: NavController) {
    var title by remember { mutableStateOf(TextFieldValue()) }
    var description by remember { mutableStateOf(TextFieldValue()) }
    var horaire by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDFF0C2))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Ajouter une routine",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF315A39),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        TextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Nom de la routine") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp).background(Color(0xFF97CF8A))
        )

        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Description (optionnel)") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp).background(Color(0xFF97CF8A))
        )

        TextField(
            value = horaire,
            onValueChange = { horaire = it },
            label = { Text("Horaire") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp).background(Color(0xFF97CF8A))
        )

        Button(
            onClick = { /* Action pour enregistrer */ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF315A39)),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("Enregistrer", color = Color(0xFFDFF0C2))
        }
        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDFF0C2))
        ) {
            Text("Retour", color = Color(0xFF315A39))
        }
    }
}