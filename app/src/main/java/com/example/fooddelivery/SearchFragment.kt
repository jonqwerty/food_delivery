package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddelivery.Adapters.PopularAdapter
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
   private lateinit var binding : FragmentSearchBinding
    private lateinit var adapter : PopularAdapter
    private lateinit var list : ArrayList<PopularModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSearchBinding.inflate(inflater, container, false)

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
        list.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$"))
        list.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$"))
        list.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$"))

        adapter = PopularAdapter(requireContext(), list)

       binding.searchMenuRv.layoutManager = LinearLayoutManager(requireContext())
        binding.searchMenuRv.adapter = adapter

        searchMenuFood()
        return binding.root
    }
    private fun searchMenuFood (){
        binding.searchMenuItem.setOnQueryTextListener(object : OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                filterList(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
               return true
            }

        })

    }

    private fun filterList (input : String?){
        val filteredList = if (input.isNullOrBlank()){
            list
        }else{
            list.filter { item ->
                item.getFoodName().contains(input, ignoreCase = true)
            }
        }

        adapter.updateList(filteredList as ArrayList<PopularModel>)

    }

}