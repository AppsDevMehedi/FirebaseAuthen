package com.example.firebaseauthen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import coil.load
import com.example.firebaseauthen.databinding.FragmentProfileBinding
import com.example.firebaseauthen.viewmodel.FirebaseViewModel


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private val firebaseVM by activityViewModels<FirebaseViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater,null,false)

        firebaseVM.user.observe(viewLifecycleOwner) {
            binding.profileName.text = it.displayName
            binding.profilePic.load(it.photoUrl)
            binding.email.text =it.email
            binding.phoneNumber.text=it.phoneNumber
            Toast.makeText(requireContext(), "${it.displayName}", Toast.LENGTH_SHORT).show()

        }
        return binding.root
    }



}