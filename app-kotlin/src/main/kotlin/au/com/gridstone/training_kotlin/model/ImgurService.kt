package au.com.gridstone.training_kotlin.model

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

/**
 * retrofit interface
 * Created by rowan on 14/7/17.
 */
interface ImgurService {

//    @Headers("Authorization: Client-ID a0d8a56262482f3")
//    @POST("oauth2/token")
//    fun generateAccessToken(): Call

    @Headers("Authorization: Client-ID a0d8a56262482f3")
    @GET("gallery/hot/viral/1")
    fun postList(): Call<ImgurResponse>
}