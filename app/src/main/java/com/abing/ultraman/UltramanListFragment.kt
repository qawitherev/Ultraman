package com.abing.ultraman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abing.ultraman.adapter.UltramanAdapter
import com.abing.ultraman.data.DataSource
import com.abing.ultraman.databinding.FragmentUltramanDetailBinding
import com.abing.ultraman.databinding.FragmentUltramanListBinding

class UltramanListFragment : Fragment() {
    private var _binding:FragmentUltramanListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUltramanListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data = DataSource().loadData()
        binding.recyclerView.adapter = UltramanAdapter(requireContext(), data)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}