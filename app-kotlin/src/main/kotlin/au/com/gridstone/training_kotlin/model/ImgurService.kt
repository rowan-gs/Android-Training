package au.com.gridstone.training_kotlin.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

/**
 * retrofit interface
 * Created by rowan on 14/7/17.
 */
interface ImgurService {
    @Headers("Authorization: Client-ID 3436c108ccc17d3")
    @GET("gallery.json")
    fun postList(): Call<ImgurResponse>
}