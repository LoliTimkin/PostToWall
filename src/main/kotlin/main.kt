fun main() {
    var new_post = Post(id = 0,
   owner_id = 0,
from_id = 0,
created_by = 0,
date = 0,
text = "something",
reply_owner_id = 0,
reply_post_id = 0,
friends_only = 0
//comments = null,
//copyright: Copyright,
//likes: Likes,
//reposts: Reposts,
//views: Views,
//post_type: String,
//signer_id: String,
//can_pin: Boolean,
//can_delete: Boolean,
//can_edit: Boolean,
//is_pinned: Boolean,
//marked_as_ads: Boolean,
//is_favorite: Boolean,
//donut: Donat,
//postponed_id: Boolean
)
    // WallService.add(new_post)

}
class Comment (
    val count: Int,
    val can_close: Boolean,
    val can_post: Boolean,
    val groups_can_post: Boolean,
    val can_open: Boolean
    )
class Copyright (
    val id: Int,
    val link: String,
    val name: String,
    val type: String
    )
class Likes (
    val count: Int,
    val user_likes: Boolean,
    val can_like: Boolean,
    val can_publish: Boolean
    )
class Reposts (
    val count: Int,
    val user_reposted: Boolean,
    )
class Views (
    val count: Int
    )
class Placeholder(

)
class Donat (
    val is_donut: Boolean,
    val paid_duration: Int,
    val placeholder: Placeholder,
    val can_publish_free_copy: Boolean,
    val edit_mode: String
)
data class Post(
    val id: Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Int,
    //val comments: Comment,
    //val copyright: Copyright,
    //val likes: Likes,
    //val reposts: Reposts,
    //val views: Views,
    //val post_type: String,
    //val signer_id: String,
    //val can_pin: Boolean,
    //val can_delete: Boolean,
    //val can_edit: Boolean,
    //val is_pinned: Boolean,
    //val marked_as_ads: Boolean,
    //val is_favorite: Boolean,
    //val donut: Donat,
    //val postponed_id: Boolean
)

object WallService {

    private var posts = emptyArray<Post>()
    private val nextId  = posts.last().id+1

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }
    fun update(post: Post): Boolean {

        for (pos in posts) {
            if (post.id == pos.id) {
                val text: String = "update"
                println(text)
                return true
            }
        }
        return false
    }
}
