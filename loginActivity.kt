package com.example.shital_yadav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                LoginBody(innerPadding)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginBody(innerPadding: PaddingValues) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    var rememberMe by remember { mutableStateOf(false) }

    val isPreview = LocalInspectionMode.current

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Image section
        if (!isPreview) {
            Image(
                painter = painterResource(com.example.shital_yadav.R.drawable.googlelogo),
                contentDescription = null,
                modifier = Modifier
                    .height(250.dp)
                    .width(250.dp)
            )
        } else {
            Box(
                modifier = Modifier
                    .height(250.dp)
                    .width(250.dp)
                    .background(Color.LightGray)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Email TextField
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            shape = RoundedCornerShape(12.dp),
            prefix = {
                Icon(imageVector = Icons.Default.Person, contentDescription = null)
            },
            placeholder = { Text("abc@gmail.com") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray.copy(0.2f),
                unfocusedContainerColor = Color.Gray.copy(0.2f)
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Password TextField
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            shape = RoundedCornerShape(12.dp),
            prefix = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = null)
            },
            suffix = {
                if (!isPreview) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_disabled_visible_24),
                        contentDescription = null,
                        modifier = Modifier.clickable {
                            passwordVisibility = !passwordVisibility
                        }
                    )
                }
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            placeholder = { Text("*******") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray.copy(0.2f),
                unfocusedContainerColor = Color.Gray.copy(0.2f)
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Remember Me checkbox
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            Checkbox(
                checked = rememberMe,
                onCheckedChange = { rememberMe = it }
            )
            Text(text = "Remember me")
            Spacer(modifier = Modifier.width(80.dp))
            Text(text = "Forget password ?",)
        }
        // Add spacing before button
        Spacer(modifier = Modifier.height(24.dp))

        // Button Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    // Handle login click here
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp) // Optional: consistent button height
            ) {
                Text(text = "Login")
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "New User? ")
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Register Now ")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "------ Use another method -------")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.facebooklogo),
                contentDescription = "Facebook Login",
                modifier = Modifier
                    .size(32.dp) // Resize logo to 32x32 dp
                    .padding(end = 16.dp)
            )

            Image(
                painter = painterResource(R.drawable.googlelogo),
                contentDescription = "Google Login",
                modifier = Modifier
                    .width(36.dp)
                    .height(36.dp)
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLogin() {
    LoginBody(PaddingValues(0.dp))
}
