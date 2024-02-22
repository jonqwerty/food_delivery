package com.example.fooddelivery.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.Adapters.PopularAdapter
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuBottomSheetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var adapter : PopularAdapter
    private lateinit var menuList : ArrayList<PopularModel>
    private lateinit var menuRv :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_menu_bottom_sheet, container, false)

        menuList = ArrayList()
        menuList.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_1, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_2, "Food", "2$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_3, "momo", "9$",1))

        adapter = PopularAdapter(requireContext(), menuList)
        menuRv = view.findViewById(R.id.menu_RV)

        menuRv.layoutManager = LinearLayoutManager(requireContext())
        menuRv.adapter = adapter

        return view
    }


}