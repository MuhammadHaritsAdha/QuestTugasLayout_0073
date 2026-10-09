package com.example.tugaspert4.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileCard(name: String, phoneNumber: String? = null, location: String, backgroundColor: Color, logoResId: Int) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(painter = painterResource(id = logoResId), contentDescription = null, modifier = Modifier.size(45.dp))
            Column(modifier = Modifier.weight(1f).padding(horizontal = 12.dp)) {
                Text(text = name, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.White)
                if (!phoneNumber.isNullOrEmpty()) {
                    Text(text = phoneNumber, fontSize = 12.sp, color = Color.Cyan)
                }
                Text(text = location, fontSize = 12.sp, color = Color(0xFFFFD700))
            }
            Image(painter = painterResource(id = logoResId), contentDescription = null, modifier = Modifier.size(45.dp))
        }
    }
}