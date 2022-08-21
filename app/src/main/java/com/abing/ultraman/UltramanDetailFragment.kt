package com.abing.ultraman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abing.ultraman.data.DataSource
import com.abing.ultraman.databinding.FragmentUltramanDetailBinding
import com.abing.ultraman.model.Ultraman
import kotlin.properties.Delegates

class UltramanDetailFragment : Fragment() {
    private var _binding: FragmentUltramanDetailBinding? = null
    private val binding get() = _binding!!
    private lateinit var ultraman: String
    private val ultramanData = DataSource().loadData()
    private lateinit var selectedUltraman: Ultraman

    companion object {
        val ULTRAMAN = "ultramanName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            ultraman = it.getString(ULTRAMAN).toString()
        }
//        for (ultra in ultramanData) {
//            if (ULTRAMAN.equals(ultra.ultramanName))
//                selectedUltraman = ultra
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
        binding.ultramanSynopsis.text = ultraman
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}