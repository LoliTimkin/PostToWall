fun main() {
    var newPost = Post(
        id = 1,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1,
        text = "something",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = 1,
        comments = Comment(
                count = 1,
                canClose = true,
                canPost = true,
                groupsCanPost = true,
                canOpen = true
                ),
        copyright = Copyright(
                id = 1,
                link = "link",
                name = "cr",
                type = "String"
                ),
        likes = Likes(
            count = 1,
            userLikes = true,
            canLike = true,
            canPublish = true
            ),
        reposts = Reposts(
            count = 1,
            userReposted = true
            ),
        views = Views(
            count = 1
            ),
        postType = "text",
        signerId = "1",
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        donut = Donat(
            isDonat = true,
            paidDuration = 1,
            placeholder = Placeholder(),
            canPublishFreeCopy = true,
            editMode = "manual"
            ),
        postponedId = true
    )
        // WallService.add(new_post)
}

data class Comment (
    val count: Int,
    val canClose: Boolean,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canOpen: Boolean
    )

data class Copyright (
    val id: Int,
    val link: String,
    val name: String,
    val type: String
    )

data class Likes (
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
    )

data class Reposts (
    val count: Int,
    val userReposted: Boolean,
    )

data class Views (
    val count: Int
    )

class Placeholder(
)

data class Donat (
    val isDonat: Boolean,
    val paidDuration: Int,
    val placeholder: Placeholder,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val comments: Comment,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerId: String,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donat,
    val postponedId: Boolean
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
