package com.example.recinrecview.model

import com.google.gson.annotations.SerializedName

data class GOTQuoteResponseItem(
    @SerializedName("members")
    val members: List<Member?>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?
) {
    data class Member(
        @SerializedName("name")
        val name: String?,
        @SerializedName("slug")
        val slug: String?
    )
}