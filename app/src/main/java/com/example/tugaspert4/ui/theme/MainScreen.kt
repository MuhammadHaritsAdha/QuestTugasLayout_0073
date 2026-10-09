package com.example.tugaspert4.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugaspert4.R
import com.example.tugaspert4.ui.components.ProfileCard

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = stringResource(id = R.string.title_header), fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text(text = stringResource(id = R.string.subtitle_header), fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(24.dp))

            ProfileCard(name = stringResource(id = R.string.name_1), location = stringResource(id = R.string.loc_1), backgroundColor = colorResource(id = R.color.card_gray), logoResId = R.drawable.logo_umy)
            ProfileCard(name = stringResource(id = R.string.name_2), phoneNumber = stringResource(id = R.string.phone_2), location = stringResource(id = R.string.loc_2), backgroundColor = colorResource(id = R.color.card_purple), logoResId = R.drawable.logo_umy)
            ProfileCard(name = stringResource(id = R.string.name_3), phoneNumber = stringResource(id = R.string.phone_3), location = stringResource(id = R.string.loc_3), backgroundColor = colorResource(id = R.color.card_blue), logoResId = R.drawable.logo_umy)
            ProfileCard(name = stringResource(id = R.string.name_4), phoneNumber = stringResource(id = R.string.phone_4), location = stringResource(id = R.string.loc_4), backgroundColor = colorResource(id = R.color.card_green), logoResId = R.drawable.logo_umy)
        }
    }
}