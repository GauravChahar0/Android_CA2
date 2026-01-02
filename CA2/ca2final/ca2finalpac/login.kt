package com.example.ca2final.ca2finalpac

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun loginn(nav: NavController){
    var email by remember { mutableStateOf("") }
    var password by remember{mutableStateOf("")}
    var check by remember{mutableStateOf(false)}
    val context= LocalContext.current
    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "login page")
        OutlinedTextField(value = email, onValueChange = {email=it},
            label = { Text(text = "email")})
        OutlinedTextField(value = password, onValueChange = {password=it},
            label = { Text(text = "password")})
        Row(modifier = Modifier .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement =Arrangement.Start){
            Checkbox(
                checked= check,
                onCheckedChange = {check=it}
            )
            Text(text = "remember me")

        }
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = {
                if (email.isEmpty() || password.isEmpty()|| check==false) {
                    Toast.makeText(context,"please fill all the fields",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(context,"login successful",Toast.LENGTH_SHORT).show()
                    nav.navigate("home")
                }
            }) {
                Text("login")
            }
        }

    }
}