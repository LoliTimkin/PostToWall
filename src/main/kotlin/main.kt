fun main() {
    var newPost = Post(
        id = 0,
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

    WallService.add(newPost)
    println(newPost.text)
    println(newPost.id)
    WallService.update(newPost, "anywhere")
    //println(WallService.posts[0].text)
    println(newPost.id)
}


object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
         post.id = 1
        } else {
            post.id = posts.last().id + 1
        }
        posts += post
        return posts.last()
    }

    fun update(post: Post, text: String): Boolean {
        for ((index, postx) in posts.withIndex()) {
            if (post.id == postx.id) {
                posts[index] = post.copy(text = post.text + ":")
                return true
            }
        }
        return false
    }
}
