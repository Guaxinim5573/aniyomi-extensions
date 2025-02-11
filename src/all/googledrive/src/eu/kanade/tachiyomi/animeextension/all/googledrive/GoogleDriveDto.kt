package eu.kanade.tachiyomi.animeextension.all.googledrive

import kotlinx.serialization.Serializable

@Serializable
data class PostResponse(
    val nextPageToken: String? = null,
    val items: List<ResponseItem>? = null,
) {
    @Serializable
    data class ResponseItem(
        val id: String,
        val title: String,
        val mimeType: String,
        val fileSize: String? = null,
    )
}

@Serializable
data class LinkData(
    val url: String,
    val type: String,
    val info: LinkDataInfo? = null,
)

@Serializable
data class LinkDataInfo(
    val title: String,
    val size: String,
)
