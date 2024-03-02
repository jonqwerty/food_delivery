package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddelivery.Adapters.NotificationAdapter
import com.example.fooddelivery.Models.NotificationModel
import com.example.fooddelivery.databinding.FragmentNotificationBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class NotificationBottomFragment : BottomSheetDialogFragment() {
   private  lateinit var binding:FragmentNotificationBottomBinding
   private lateinit var notificationList: ArrayList<NotificationModel>
   private lateinit var adapter: NotificationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentNotificationBottomBinding.inflate(inflater, container, false)

        notificationList = ArrayList()
        notificationList.add(NotificationModel(R.drawable.pop_menu_1, "Notification text"))
        notificationList.add(NotificationModel(R.drawable.pop_menu_1, "Notification text"))
        notificationList.add(NotificationModel(R.drawable.pop_menu_1, "Notification text"))


        binding.btnBack.setOnClickListener{
            dismiss()
        }

        adapter = NotificationAdapter(requireContext(), notificationList as ArrayList<NotificationModel>)

        binding.noteRv.layoutManager = LinearLayoutManager(requireContext())
        binding.noteRv.adapter = adapter

        return binding.root


    }


}