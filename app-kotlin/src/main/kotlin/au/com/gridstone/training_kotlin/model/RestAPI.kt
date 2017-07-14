package au.com.gridstone.training_kotlin.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by rowan on 14/7/17.
 */
class RestAPI {
    private val imgurService: ImgurService

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.imgur.com/3/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        imgurService = retrofit.create(ImgurService::class.java)
    }

    fun getPosts() = imgurService.postList()
}