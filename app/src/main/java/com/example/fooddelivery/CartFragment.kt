package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddelivery.Adapters.CartAdapter
import com.example.fooddelivery.Adapters.PopularAdapter
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.databinding.FragmentCartBinding


class CartFragment : Fragment() {

    private lateinit var binding : FragmentCartBinding

    private  lateinit var list : ArrayList<PopularModel>
    private lateinit var adapter : CartAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater, container, false)

        list = ArrayList()
        list.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$"))
        list.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$"))
        list.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$"))
        list.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$"))
        list.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$"))
        list.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$"))
        list.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$"))
        list.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$"))
        list.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$"))

        adapter = CartAdapter(requireContext(), list)

        binding.cartRv.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRv.adapter = adapter


        return binding.root
    }


}