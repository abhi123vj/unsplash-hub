package app.web.abh1ram.unsplashhub.data.remote

import app.web.abh1ram.unsplashhub.data.util.Constants
import retrofit2.http.GET
import retrofit2.http.Headers

interface UnsplashApiService {

    @Headers("Authorization: Client-ID ${Constants.ACCESS_KEY}")
    @GET("/photos")
    suspend fun getEditorialFeedImages():String
}