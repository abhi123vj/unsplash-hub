package app.web.abh1ram.unsplashhub.domain.model

import android.icu.text.ListFormatter.Width

data class UnsplashImage(
    val id: String,
    val imageUrlSmall: String,
    val imageUrlRegular: String,
    val imageUrlRaw: String,
    val photographerName: String,
    val photographerUsername: String,
    val photographerProfileImgUrl: String,
    val photographerProfileLink: String,
    val width: Int,
    val height: Int,
    val description: String?,

    )
