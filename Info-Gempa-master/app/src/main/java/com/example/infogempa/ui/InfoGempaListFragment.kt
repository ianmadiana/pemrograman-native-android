package com.example.infogempa.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.infogempa.R
import com.example.infogempa.databinding.FragmentInfoGempaListBinding


class InfoGempaListFragment : Fragment() {
    private val viewModel: InfoGempaViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentInfoGempaListBinding.inflate(inflater)
        viewModel.getInfoGempaList()
        binding.viewModel = viewModel
        binding.recyclerView.adapter = InfoGempaListAdapter(InfoGempaListener { infogempa ->
            viewModel.onInfoGempaClicked(infogempa)
            findNavController().navigate(R.id.action_infoGempaListFragment_to_infoGempaDetailFragment)
        })

        return binding.root
    }
}