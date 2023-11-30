
package com.example.firebaseauthen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.firebaseauthen.R
import com.example.firebaseauthen.databinding.FragmentLoginBinding
import com.example.firebaseauthen.utils.firebaseUtils.firebaseAuth

class loginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(inflater, null, false)

        binding.buttonLogin.setOnClickListener {
            login()
        }


        return binding.root
    }

    private fun login() {
        val email = binding.editTextEmailAddress.text.toString()
        val pass  = binding.editTextPassword.text.toString()
        // calling signInWithEmailAndPassword(email, pass)
        // function using Firebase auth object
        //On successful response Display a Toast
        firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
            if (it.isSuccessful) {
                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
                Toast.makeText(requireActivity(),"Successfully LogedIn", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(requireActivity(), "Log In failed", Toast.LENGTH_SHORT).show()
        }
    }

    }