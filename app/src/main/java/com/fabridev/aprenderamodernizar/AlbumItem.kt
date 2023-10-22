package com.fabridev.aprenderamodernizar

import com.google.gson.annotations.SerializedName

class AlbumItem (
    @SerializedName("id")
    val id: Int,

    @SerializedName("userId")
    val userId: Int,

    @SerializedName("title")
    val title: String
)