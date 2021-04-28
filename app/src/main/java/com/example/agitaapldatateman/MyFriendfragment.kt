package com.example.agitaapldatateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendfragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Agita Vidiasti", "Perempuan", "agita@gmail.com", "085985697319",
        "Malang")
        )
        listTeman.add(
            MyFriend("Novita Dwi", "Perempuan", "novita@gmail.com", "081232356456",
        "Malang")
        )
        listTeman.add(
            MyFriend("Erfian Arum", "Perempuan", "erfian@gmail.com", "081363625451",
        "Malang")
        )
        listTeman.add(
            MyFriend("Putri Rohmatul", "Perempuan", "putri@gmail.com", "085695789456",
        "Malang")
        )
        listTeman.add(
            MyFriend("Mario Aji", "Laki-laki", "mario@gmail.com", "082456789123",
        "Tulungagung")
        )
        listTeman.add(
            MyFriend("Oky Mikael", "Laki-laki", "oky@gmail.com", "081478512356",
        "Malang")
        )
        listTeman.add(
            MyFriend("Ikomang Damai", "Laki-laki", "ikomang@gmail.com", "085645698789",
        "Sulawesi")
        )
        listTeman.add(
            MyFriend("Garwita", "Perempuan", "garwita@gmail.com", "085987456963",
        "Surabaya")
        )
        listTeman.add(MyFriend("Rafli Ichwan", "Laki-laki", "rafli@gmail.com", "081456321123",
        "Jakarta"))
        listTeman.add(
            MyFriend("Nova Eka", "Laki-laki", "nova@gmail.com", "082547789658",
        "Bandung")
        )
        listTeman.add(
            MyFriend("Widya Retnaning", "Perempuan", "widya@gmail.com", "085456963214",
        "Donomulyo")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}