import org.junit.Assert.*
import org.junit.Test

//import org.junit.jupiter.api.Test

class WallServiceTest {

    @Test
    fun add() {
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

        val resId = WallService.add(newPost).id

        assertEquals(1, resId)
    }

}