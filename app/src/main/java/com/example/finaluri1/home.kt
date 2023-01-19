package com.example.finaluri1

import android.app.Activity
import android.content.Intent
import android.net.MailTo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.finaluri1.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class home : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var DataBase:DatabaseReference
    private lateinit var binding:ActivityMainBinding
    private lateinit var ClickImage: ImageView
    private lateinit var ClickButton: Button
    private lateinit var EnterMail: EditText
    private lateinit var EnterPassword: EditText
    private lateinit var SignUp:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ClickImage = view.findViewById(R.id.imageView2)
        EnterMail = view.findViewById(R.id.EnterMail)
        EnterPassword = view.findViewById(R.id.EnterPassword)
        ClickButton = view.findViewById(R.id.LoginButton)
        SignUp=view.findViewById(R.id.textView13)
        ClickButton.setOnClickListener {
            login()
        }
        SignUp.setOnClickListener {
            startActivity(Intent(requireContext(), MainActivity3::class.java))

        }




        ClickImage.setOnClickListener {
            Toast.makeText(requireContext(), "For Your Baby <3", Toast.LENGTH_SHORT).show()
        }


    }

    fun login() {
        var sheiyvaneMail: Boolean = EnterMail.text.toString() == ""
        var sheiyvaneParoli: Boolean = EnterPassword.text.toString() == ""
        if (sheiyvaneMail && sheiyvaneParoli) {
            Toast.makeText(requireContext(), "Enter info!", Toast.LENGTH_SHORT).show()
        } else {
            ClickButton.setOnClickListener {
                startActivity(Intent(requireContext(), MainActivity2::class.java))

            }
        }
    }
}
















