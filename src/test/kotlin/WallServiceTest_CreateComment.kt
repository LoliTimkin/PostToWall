import org.junit.Test

import org.junit.Assert.*

class WallServiceTest_CreateComment {

    //
    @Test(expected = WallService.PostNotFoundException::class)
    fun `should exception`() {
        val comment = CommentToPost(1,1,1,"it will exceiption, now", 1)
        WallService.createComment(0, comment)
    }

    @Test
    fun `Is no should exception`() {
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
                count = 0,
                canClose = true,
                canPost = true,
                groupsCanPost = true,
                canOpen = true,
                postId = 0,
                text = "text"),
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
        val comment = CommentToPost(1,1,1,"it will exceiption, now", 1)
        val addedComment = WallService.createComment(1, comment)
        assert(WallService.comments.last() == addedComment)
    }
}