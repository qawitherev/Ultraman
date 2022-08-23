package com.abing.ultraman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abing.ultraman.adapter.FavUltramanAdapter
import com.abing.ultraman.data.DataSource
import com.abing.ultraman.databinding.FragmentFavUltramanBinding
import com.abing.ultraman.model.Ultraman

class FavUltramanFragment : Fragment() {
    private var _binding: FragmentFavUltramanBinding? = null
    private val binding get() = _binding!!
    private val favUltraman = DataSource().loadFavUltraman()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavUltramanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerView.adapter = FavUltramanAdapter(requireContext(), favUltraman)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}