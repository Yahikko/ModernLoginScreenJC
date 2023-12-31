package com.example.modernloginscreenjc

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.modernloginscreenjc.ui.theme.Black
import com.example.modernloginscreenjc.ui.theme.focusedTextFieldText
import com.example.modernloginscreenjc.ui.theme.textFieldContainer
import com.example.modernloginscreenjc.ui.theme.unfocusedTextFieldText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginTextField(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String
) {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black

    TextField(
        modifier = modifier,
        value = "",
        onValueChange = {},
        label = {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
                color = uiColor
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = MaterialTheme.colorScheme.textFieldContainer,
            placeholderColor = MaterialTheme.colorScheme.focusedTextFieldText,
            disabledPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText
        ),
        trailingIcon = {
            if (trailing.isNotEmpty()) {
                TextButton(onClick = {}) {
                    Text(
                        text = trailing,
                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium),
                        color = uiColor
                    )
                }
            }
        }
    )
}