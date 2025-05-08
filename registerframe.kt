import android.content.Context
import android.icu.util.Calendar
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun RegisterScreenWithDatePicker(context: Context = LocalContext.current) {
    // State holders for form fields
    val firstName = remember { mutableStateOf("") }
    val lastName = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val country = remember { mutableStateOf("") }
    val dob = remember { mutableStateOf("") }
    val gender = remember { mutableStateOf("") }
    val termsAccepted = remember { mutableStateOf(false) }

    // Country dropdown related
    val countryList = listOf("Nepal", "India", "USA", "UK")
    var expanded by remember { mutableStateOf(false) }

    // Date picker dialog
    val calendar = Calendar.getInstance()
    val datePickerDialog = remember {
        android.app.DatePickerDialog(
            context,
            { _, year, month, dayOfMonth ->
                dob.value = "$dayOfMonth/${month + 1}/$year"
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
    }

    // UI layout
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Register", style = MaterialTheme.typography.titleLarge)

        // First and Last name fields
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
                value = firstName.value,
                onValueChange = { firstName.value = it },
                label = { Text("Firstname") },
                modifier = Modifier.weight(1f)
            )
            OutlinedTextField(
                value = lastName.value,
                onValueChange = { lastName.value = it },
                label = { Text("Lastname") },
                modifier = Modifier.weight(1f)
            )
        }

        // Email field
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        // Country dropdown
        Box {
            OutlinedTextField(
                value = country.value,
                onValueChange = {},
                label = { Text("Select Country") },
                trailingIcon = {
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown",
                        Modifier.clickable { expanded = !expanded }
                    )
                },
                readOnly = true,
                modifier = Modifier.fillMaxWidth()
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                countryList.forEach {
                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            country.value = it
                            expanded = false
                        }
                    )
                }
            }
        }

        // Date of Birth field using DatePicker
        OutlinedTextField(
            value = dob.value,
            onValueChange = {},
            label = { Text("DOB") },
            modifier = Modifier
                .fillMaxWidth()
                .clickable { datePickerDialog.show() },
            readOnly = true
        )

        // Gender radio buttons
        Text("Gender")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = gender.value == "Male", onClick = { gender.value = "Male" })
            Text("Male")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(selected = gender.value == "Female", onClick = { gender.value = "Female" })
            Text("Female")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(selected = gender.value == "Other", onClick = { gender.value = "Other" })
            Text("Other")
        }

        // Terms and conditions checkbox
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = termsAccepted.value, onCheckedChange = { termsAccepted.value = it })
            Text("I accept terms and conditions")
        }

        // Register button
        Button(
            onClick = { /* Register logic */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Register")
        }

        // Sign-in text
        Text(
            text = "Already have Account? Signin",
            modifier = Modifier
                .fillMaxWidth()
                .clickable { /* Navigate to signin */ },
            textAlign = TextAlign.Center,
            color = Color.Blue
        )
    }
}

// PREVIEW FUNCTION for Android Studio Design view
@RequiresApi(Build.VERSION_CODES.N)
@Preview(showBackground = true)
@Composable
fun RegisterScreenWithDatePickerPreview() {
    RegisterScreenWithDatePicker()
}
