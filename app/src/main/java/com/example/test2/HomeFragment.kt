package com.example.test2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var adapter : ImageAdapter
    private lateinit var items : ArrayList<Image>
    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //binding.recyclerView.setHasFixedSize(true)

        items = ArrayList()
        items.add(Image(R.drawable.mario, "Super Mario Bros Deluxe"))
        items.add(Image(R.drawable.minecraft, "Minecraft"))
        items.add(Image(R.drawable.pokemon, "Pokemon Diamante Lucente"))
        items.add(Image(R.drawable.smashbros, "Super Smash Bros"))
        items.add(Image(R.drawable.sonic, "Sonic"))
        items.add(Image(R.drawable.zelda, "Zelda"))

        adapter = ImageAdapter(items)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

    }

}