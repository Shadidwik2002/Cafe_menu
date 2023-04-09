package com.example.ass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.TextureView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var f = appetizerclass()
        var f1= Desert()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var f = appetizerclass()
        var f1= Desert()
        when(item.itemId){
            R.id.item1->f.show(supportFragmentManager,"Description")
            R.id.item2->f1.show(supportFragmentManager,"Description")

        }
        return true
    }
    fun recieveFeedback(feedback:String){
val feedback1: TextView = findViewById(R.id.id1)
feedback1.text = "You Ordered a $feedback";
    }
}