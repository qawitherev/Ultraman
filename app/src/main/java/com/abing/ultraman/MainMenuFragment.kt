package com.abing.ultraman

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abing.ultraman.databinding.FragmentMainMenuBinding

class MainMenuFragment : Fragment() {
    private var _binding: FragmentMainMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.allUltramanButton.setOnClickListener { allUltramanActivity() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun allUltramanActivity() {
        val intent = Intent(getActivity(), UltramanListActivity::class.java)
        startActivity(intent)
    }

}