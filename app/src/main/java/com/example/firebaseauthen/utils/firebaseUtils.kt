package com.example.firebaseauthen.utils

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

object firebaseUtils {
    val firebaseAuth: FirebaseAuth =FirebaseAuth.getInstance()
    val firebaseUser: FirebaseUser? = firebaseAuth.currentUser
}