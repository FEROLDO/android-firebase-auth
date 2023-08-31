package net.simplifiedcoding.ui.about

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel

@Composable
fun AboutScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    
    Text(text = "About Screen")
}

