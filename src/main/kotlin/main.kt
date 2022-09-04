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
                canOpen = true,
                postId = 1,
                text = "anything"),
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

    var changedPost = Post(
        id = 1,
        ownerId = 2,
        fromId = 2,
        createdBy = 2,
        date = 1,
        text = "anywhere",
        replyOwnerId = 2,
        replyPostId = 2,
        friendsOnly = 2,
        comments = Comment(
            count = 2,
            canClose = false,
            canPost = false,
            groupsCanPost = false,
            canOpen = false,
            postId = 1,
            text = "everything"),
        copyright = Copyright(
            id = 2,
            link = "link2",
            name = "cr2",
            type = "Picture"
        ),
        likes = Likes(
            count = 2,
            userLikes = false,
            canLike = false,
            canPublish = false
        ),
        reposts = Reposts(
            count = 2,
            userReposted = false
        ),
        views = Views(
            count = 2
        ),
        postType = "text+picture",
        signerId = "2",
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Donat(
            isDonat = false,
            paidDuration = 2,
            placeholder = Placeholder(),
            canPublishFreeCopy = false,
            editMode = "post"
        ),
        postponedId = false
    )
    WallService.update(changedPost)
    val comment = CommentToPost(1,1,1,"it will not exceiption, now", 1)
    WallService.createComment(1, comment)

    println(WallService.comments.last())
}

