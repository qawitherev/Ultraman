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
        for (ultra in ultramanData) {
            val loopUltraman = requireContext().resources.getString(ultra.ultramanName)
            if (ultraman == loopUltraman) {
                selectedUltraman = ultra
            }
        }
        binding.ultramanImage.setImageResource(selectedUltraman.ultramanImage)
        binding.ultramanSynopsis.text = requireContext().resources.getString(selectedUltraman.ultramanSynopsis)
        binding.ultramanHeight.text = requireContext().resources.getString(selectedUltraman.ultramanHeight)
        binding.ultramanWeight.text = requireContext().resources.getString(selectedUltraman.ultramanWeight)
        binding.ultramanSpecialMove.text = requireContext().resources.getString(selectedUltraman.ultramanSpecMove)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}