package com.example.finaluri1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [list.newInstance] factory method to
 * create an instance of this fragment.
 */
class list : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var infoButton: Button
    private lateinit var infoButton2: Button
    private lateinit var infoButton3: Button
    private lateinit var infoButton4: Button
    private lateinit var moreButton: Button
    private lateinit var Baby: ImageView

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
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment list.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            list().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        moreButton = view.findViewById(R.id.button)
        infoButton = view.findViewById(R.id.button2)
        infoButton2 = view.findViewById(R.id.button3)
        Baby = view.findViewById(R.id.imageView2)
        infoButton3 = view.findViewById(R.id.button4)
        infoButton4 = view.findViewById(R.id.button5)

        Baby.setOnClickListener {
            Toast.makeText(requireContext(), "For Your Baby <3", Toast.LENGTH_SHORT).show()
        }
        moreButton.setOnClickListener {
            Toast.makeText(
                requireContext(),
                "No more available babysitters right now!",
                Toast.LENGTH_SHORT
            ).show()
        }
        infoButton.setOnClickListener {
            startActivity(Intent(requireContext(), Profile1::class.java))
        }
        infoButton2.setOnClickListener {
            startActivity(Intent(requireContext(), Profile2::class.java))
        }
        infoButton3.setOnClickListener {
            startActivity(Intent(requireContext(), Profile3::class.java))
        }
        infoButton4.setOnClickListener {
            startActivity(Intent(requireContext(), Profile4::class.java))
        }

        }
    }