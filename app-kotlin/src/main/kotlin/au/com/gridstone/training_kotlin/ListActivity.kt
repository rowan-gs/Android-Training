package au.com.gridstone.training_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MotionEvent
import android.view.View
import android.widget.ProgressBar
import au.com.gridstone.training_kotlin.model.ImgurResponse
import au.com.gridstone.training_kotlin.model.RecyclerAdapter
import au.com.gridstone.training_kotlin.model.RestAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by rowan on 13/7/17.
 */
class ListActivity : AppCompatActivity() {

    var progressSpinner: ProgressBar? = null
    var recyclerView: RecyclerView? = null
    val recyclerAdapter = RecyclerAdapter()
    val linearLayoutManager = LinearLayoutManager(this)
    val restAPI = RestAPI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val progressSpinner = findViewById(R.id.progressSpinner) as ProgressBar
        this.progressSpinner = progressSpinner

        val recyclerView = findViewById(R.id.postList) as RecyclerView
        this.recyclerView = recyclerView
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerAdapter

        val callback = object:Callback<ImgurResponse> {
            override fun onResponse(call: Call<ImgurResponse>?, response: Response<ImgurResponse>?) {
                println("done!")
                println(response)
                progressSpinner.visibility = View.INVISIBLE
                recyclerView.visibility = View.VISIBLE
            }

            override fun onFailure(call: Call<ImgurResponse>?, t: Throwable?) {
                println("failed!")
                t?.printStackTrace()
            }

        }

        val call = restAPI.getPosts()
        call.enqueue(callback)
    }
}

