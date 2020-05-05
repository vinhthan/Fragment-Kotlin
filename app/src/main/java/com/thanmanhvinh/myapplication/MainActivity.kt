package com.thanmanhvinh.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thanmanhvinh.fragmentkotlin.FragmentOne
import com.thanmanhvinh.fragmentkotlin.FragmentTwo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            showFragmentOne()


        btn2.setOnClickListener {
            showFragmentTwo()
        }
    }

    private fun showFragmentOne(){
        var transation = manager.beginTransaction()
        var fragmentOne = FragmentOne()
        transation.replace(R.id.container, fragmentOne)
        transation.addToBackStack(null)
        transation.commit()
    }

    private fun showFragmentTwo(){
        var transation = manager.beginTransaction()
        var fragmentTwo = FragmentTwo()
        transation.replace(R.id.container, fragmentTwo)
        transation.addToBackStack(null)
        transation.commit()
    }
}
