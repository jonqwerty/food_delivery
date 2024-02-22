package com.example.fooddelivery.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.databinding.CartAddItemBinding
import com.example.fooddelivery.databinding.HomeFoodItemBinding

class CartAdapter(
    val context : Context,
    var list : ArrayList<PopularModel>
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartAdapter.CartViewHolder {
        val binding = CartAddItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartAdapter.CartViewHolder, position: Int) {


        val listModel = list[position]

        holder.foodName.text = listModel.getFoodName()
        holder.foodPrice.text = listModel.getFoodPrice()
        listModel.getFoodImage()?.let { holder.foodImage.setImageResource(it) }

    }

    override fun getItemCount(): Int {
       return list.size
    }

   inner class CartViewHolder(binding: CartAddItemBinding) : RecyclerView.ViewHolder(binding.root) {

       val foodImage = binding.homeFoodImage
       val foodName = binding.homeFoodName
       val foodPrice = binding.homeFoodPrice

       val plus = binding.plusBtn
       val minus = binding.minusBtn

    }
}