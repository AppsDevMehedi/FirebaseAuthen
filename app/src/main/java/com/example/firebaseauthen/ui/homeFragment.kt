package com.example.firebaseauthen.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.firebaseauthen.databinding.FragmentHomeBinding


class homeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,null,false)


//For bundle simple error here
//        val userInfo = arguments?.getSerializable("userInfo") as? UserInfo
//        if(userInfo != null) {
//            //You  can access the user information
//            val displayName = userInfo.displayName
//            val email = userInfo.email
//            val photoUrl = userInfo.photoUrl
//
//            /*binding.textView.text = "$displayName \n${email}"
//            binding.imageView.load(photoUrl)*/
//
//            Log.d("Tag","UserInfo: $displayName\n$email\n$photoUrl")
//
//            firebaseVM.saveUserData(userInfo)
//
//
//        }


        return binding.root

    }

}

