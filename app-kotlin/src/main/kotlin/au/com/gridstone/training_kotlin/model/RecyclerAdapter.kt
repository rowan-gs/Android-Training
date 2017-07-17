package au.com.gridstone.training_kotlin.model

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import au.com.gridstone.training_kotlin.R
import com.squareup.picasso.Picasso


/**
 * Created by rowan on 13/7/17.
 */
class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.PostHolder>() {

    val model = Model()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false)
        val holder = PostHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.bindTo(model.posts[position])
    }

    override fun getItemCount(): Int {
        return model.posts.size
    }

    class PostHolder(val v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private val postImage: ImageView
        private val postTitle: TextView

        init {
            postImage = v.findViewById(R.id.postImage) as ImageView
            postTitle = v.findViewById(R.id.postTitle) as TextView

            v.setOnClickListener(this)

        }

        override fun onClick(p0: View?) {

        }

        fun bindTo(post: ImgurPost) {
            Picasso.with(v.context).load(R.drawable.maxresdefault).fit().centerCrop().into(postImage)
            postTitle.text = post.title
        }
    }
}