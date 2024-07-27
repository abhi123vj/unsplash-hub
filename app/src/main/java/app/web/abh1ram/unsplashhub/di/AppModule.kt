package app.web.abh1ram.unsplashhub.di

import app.web.abh1ram.unsplashhub.data.remote.UnsplashApiService
import app.web.abh1ram.unsplashhub.data.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object AppModule {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(Constants.Base_URL)
        .build()

    val retrofitService: UnsplashApiService by lazy{
        retrofit.create(UnsplashApiService::class.java)
    }
}