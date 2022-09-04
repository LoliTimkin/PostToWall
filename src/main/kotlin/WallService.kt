object WallService {
    private var posts = emptyArray<Post>()
    var comments = emptyArray<CommentToPost>()

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            posts += post.copy(id = 1)
        } else {
            posts += post.copy(id = posts.last().id)
        }
        return posts.last()
    }

    fun update(currentPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (currentPost.id == post.id) {
                posts[index] = currentPost.copy(id = currentPost.id, date = currentPost.date)
                // println(posts[0].text)
                // println(posts[0].id)
                return true
            }
        }
        return false
    }

    class PostNotFoundException(message: String): RuntimeException(message)

    fun createComment(postId: Int, comment: CommentToPost): CommentToPost {

        for (post in posts) {
            if (comment.postId == post.id) {
                comments += comment
                //post = post.copy(comments = comments.copy(count = count + 1))
            } else throw PostNotFoundException("Not found comment from post with Id:$postId\"")
        }
        return comment
    }
}
