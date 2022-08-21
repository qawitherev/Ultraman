package com.abing.ultraman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abing.ultraman.databinding.FragmentUltramanDetailBinding

class UltramanDetailFragment : Fragment() {
    private var _binding: FragmentUltramanDetailBinding? = null
    private val binding get() = _binding!!
    private lateinit var ultraman: String

    companion object {
        val ULTRAMAN = "ultramanName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            ultraman = it.getString(ULTRAMAN).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUltramanDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ultramanHeight.text = ultraman
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}