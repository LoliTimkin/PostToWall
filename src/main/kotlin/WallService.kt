object WallService {
    private var posts = emptyArray<Post>()

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
}
