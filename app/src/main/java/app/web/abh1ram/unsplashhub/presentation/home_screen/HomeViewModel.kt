package app.web.abh1ram.unsplashhub.presentation.home_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.web.abh1ram.unsplashhub.data.mapper.toDomainModelList
import app.web.abh1ram.unsplashhub.data.remote.dto.UnsplashImageDto
import app.web.abh1ram.unsplashhub.di.AppModule
import app.web.abh1ram.unsplashhub.domain.model.UnsplashImage
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    var images : List<UnsplashImage> by mutableStateOf(emptyList())
        private set
    init {
        getImages()
    }
    private fun getImages(){
        viewModelScope.launch {
            val result = AppModule.retrofitService.getEditorialFeedImages()
            images = result.toDomainModelList()
        }
    }
}