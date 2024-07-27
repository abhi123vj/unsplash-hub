package app.web.abh1ram.unsplashhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import app.web.abh1ram.unsplashhub.presentation.home_screen.HomeScreen
import app.web.abh1ram.unsplashhub.presentation.home_screen.HomeViewModel
import app.web.abh1ram.unsplashhub.presentation.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                val viewModel = viewModel<HomeViewModel>()
                HomeScreen(images = viewModel.images)
            }
        }
    }
}


