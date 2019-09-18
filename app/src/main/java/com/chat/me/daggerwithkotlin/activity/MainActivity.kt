package com.chat.me.daggerwithkotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chat.me.daggerwithkotlin.DaggerPenComponent
import com.chat.me.daggerwithkotlin.R
import com.chat.me.daggerwithkotlin.component.PenComponent
import com.chat.me.daggerwithkotlin.models.Pen

class MainActivity : AppCompatActivity() {

    lateinit var pen: Pen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val penComponent: PenComponent = DaggerPenComponent.create()
        pen = penComponent.getPen()
        pen.write()
    }
}
