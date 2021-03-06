package com.example.drone.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.drone.R
import com.ishaquehassan.recyclerviewgeneraladapter.RecyclerViewGeneralAdapter
import kotlinx.android.synthetic.main.home.*

class Home : BaseTabFargment(){

    override fun getIcon(): Int  = R.mipmap.home
    override fun getSelectedIcon(): Int  = R.drawable.cart

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       data class categories(val img:String,val title:String)
        catRec.adapter = RecyclerViewGeneralAdapter(
            arrayListOf(
                categories("https://images.unsplash.com/photo-1514505213055-b456c4420f67?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1534&q=80","Beginner"),
                categories("https://images.unsplash.com/photo-1527441385177-3dad16222699?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1041&q=80","Racing"),
                categories("https://images.unsplash.com/photo-1534798270584-a695c8a977e9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1052&q=80","Selfie"),
                categories("https://images.unsplash.com/photo-1499808624579-3471e371ce50?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","Performance")
            ),
            R.layout.single_cat

        ) {itemData,viewHolder->
            val itemView = viewHolder.itemView
            val img = itemView.findViewById<ImageView>(R.id.image)
            Glide.with(this).load(itemData.img).into(img);
            itemView.findViewById<TextView>(R.id.text).text = itemData.title

        }
        catRec.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)


        data class prod(val img:String,val title:String , val price:String)
        prodRec.adapter = RecyclerViewGeneralAdapter(
            arrayListOf(
                prod("https://images.unsplash.com/photo-1527441385177-3dad16222699?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1041&q=80","High Tech Drone","Rs 10,000"),

                        prod("https://images.unsplash.com/photo-1514505213055-b456c4420f67?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1534&q=80","Beginner Drone","Rs 50,000"),
                prod("https://images.unsplash.com/photo-1534798270584-a695c8a977e9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1052&q=80","High Range","Rs 60,000"),
                prod("https://images.unsplash.com/photo-1499808624579-3471e371ce50?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","Speedo Tech","Rs 55,000")

            ),
            R.layout.single_prod_home

        ){itemData,viewHolder->
            val itemView = viewHolder.itemView
            val img1 = itemView.findViewById<ImageView>(R.id.image)
            itemView.findViewById<TextView>(R.id.text).text = itemData.title
            itemView.findViewById<TextView>(R.id.price).text = itemData.price
            Glide.with(this).load(itemData.img).into(img1);

        }
        prodRec.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        data class prodSec(val img:String,val title:String , val price:String)
        prodSec.adapter = RecyclerViewGeneralAdapter(
            arrayListOf(
                prodSec("https://images.unsplash.com/photo-1499808624579-3471e371ce50?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80","Baby Drone","Rs 50,000"),

                prodSec("https://images.unsplash.com/photo-1514505213055-b456c4420f67?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1534&q=80","Super Drone","Rs 1,00000"),
                prodSec("https://images.unsplash.com/photo-1527441385177-3dad16222699?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1041&q=80","Bhoom Bhoom","Rs 75,000"),
                prodSec("https://images.unsplash.com/photo-1534798270584-a695c8a977e9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1052&q=80","Beginner Drone","Rs 66,0000")

            ),
            R.layout.single_prod_home_sec

        ){itemData,viewHolder->
            val itemView = viewHolder.itemView
            val img1 = itemView.findViewById<ImageView>(R.id.image)
            itemView.findViewById<TextView>(R.id.text).text = itemData.title
            itemView.findViewById<TextView>(R.id.price).text = itemData.price
            Glide.with(this).load(itemData.img).into(img1);
        }
        prodSec.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)


    }


}