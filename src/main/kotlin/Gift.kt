data class GiftAttachment (
    override val type: String ="Gift",
    val Gift: GiftAttachment?,
    val id: String,
    val thumb_256: String,
    val thumb_96: String,
    val thumb_48: String
): Attachment()