package com.example.firebaseauthen.model.userInfo

import java.io.Serializable

data class UserInfo(
    val displayName: String,
    val email: String,
    val photoUrl: String,
    val phoneNumber: String
):Serializable