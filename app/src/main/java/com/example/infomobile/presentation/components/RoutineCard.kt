package com.example.infomobile.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.infomobile.presentation.RoutineVM
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


/*@Composable
fun RoutineCard(routine: RoutineVM){
    Column {
        Text(routine.title)
        Text(routine.description)
        Text(routine.horaire)
    }
}*/

@Composable
fun RoutineCard(routine: RoutineVM) {
    Column(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Color(0xFFB1DD9E), shape = RoundedCornerShape(8.dp))
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(routine.title, fontWeight = FontWeight.Bold)
                Text(routine.description, fontSize = 12.sp)
            }
            IconButton(onClick = { /* Action modifier */ }) {
                Icon(Icons.Default.Edit, contentDescription = "Modifier")
            }
        }
    }
}