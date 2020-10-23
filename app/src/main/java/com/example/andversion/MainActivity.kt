package com.example.andversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var andVersionArray = Array<AndVersion>(10) { AndVersion("", "", R.drawable.canada) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seedItems()
        andVersionRecyclerView.layoutManager = LinearLayoutManager(this)
        andVersionRecyclerView.adapter = AndVersionAdapter(andVersionArray)
    }
    private fun seedItems(){
        val nameArray = resources.getStringArray(R.array.andVersionTxt)
        val popArray = resources.getStringArray(R.array.andVersionPop)
        val imgArray = intArrayOf(R.drawable.canada, R.drawable.chili, R.drawable.cote, R.drawable.senegal, R.drawable.sweden, R.drawable.norvege, R.drawable.costa_rica, R.drawable.argentine, R.drawable.greenland, R.drawable.mexico)
        for (k in 0..(nameArray.size-1)) {
            andVersionArray[k] = AndVersion(nameArray[k], popArray[k], imgArray[k])
        }
    }
}