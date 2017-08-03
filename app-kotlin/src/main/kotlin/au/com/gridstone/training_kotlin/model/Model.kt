package au.com.gridstone.training_kotlin.model

/**
 * Created by rowan on 13/7/17.
 */
class Model {
    var posts: Array<ImgurPost>

    init {
        posts = arrayOf(
                ImgurPost("This cat is pretty good"),
                ImgurPost("I like this cat too"),
                ImgurPost("Cats are pretty crazy!"),
                ImgurPost("Despite everything, it's a cat"),
                ImgurPost("A fifth cat for good measure"))
    }
}