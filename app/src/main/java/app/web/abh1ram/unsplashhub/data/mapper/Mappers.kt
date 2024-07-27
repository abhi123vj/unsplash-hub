package app.web.abh1ram.unsplashhub.data.mapper

import app.web.abh1ram.unsplashhub.data.remote.dto.UnsplashImageDto
import app.web.abh1ram.unsplashhub.domain.model.UnsplashImage

fun UnsplashImageDto.toDomainModel(): UnsplashImage {
    return UnsplashImage(
        id = this.id,
        imageUrlSmall = this.urls.small,
        imageUrlRegular = this.urls.regular,
        imageUrlRaw = this.urls.raw,
        photographerName = this.user.name,
        photographerUsername = this.user.username,
        photographerProfileImgUrl = this.user.profileImage.small,
        photographerProfileLink = this.user.links.html,
        width = this.width,
        height = this.width,
        description = this.description
    )
}

fun List<UnsplashImageDto>.toDomainModelList():List<UnsplashImage>{
    return this.map {  it.toDomainModel() }
}