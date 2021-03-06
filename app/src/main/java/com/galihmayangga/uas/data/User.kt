package com.galihmayangga.uas.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class User (
    val login: String,
    val avatarUrl: String,
    val htmlUrl: String,
    val followesUrl: String,
    val followers: Int,
    val followingUrl: String,
    val following: Int,
    val repoUrl: String,
    val repo: Int
) : Parcelable