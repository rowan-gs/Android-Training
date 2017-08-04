package au.com.gridstone.training_kotlin.model

/**
 * Created by rowan on 13/7/17.
 */
data class ImgurPost(
        val title: String,
        val datetime: Long,
        val width: Int,
        val height: Int,
        val views: Int,
        val link: String,
        val is_album: Boolean
        )