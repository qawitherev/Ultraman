package com.abing.ultraman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
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
//        set all the views to corresponding clicked ultraman
        setView()
        binding.backToListButton.setOnClickListener { backtoList(view) }
        binding.addToFavButton.setOnClickListener { addToFav() }
    }

    private fun addToFav() {
        DataSource().favUltraman.add(selectedUltraman)
        val selectedFavUltraman = requireContext().resources.getString(selectedUltraman.ultramanName)
        Toast.makeText(context, "$selectedFavUltraman added to favourite", Toast.LENGTH_SHORT).show()
    }

    private fun backtoList(view: View) {
        view.findNavController().navigate(R.id.action_ultramanDetailFragment_to_ultramanListFragment)
    }

    private fun setView() {
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