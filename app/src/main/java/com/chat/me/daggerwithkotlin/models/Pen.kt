package com.chat.me.daggerwithkotlin.models

import android.util.Log
import javax.inject.Inject

/**
 * Created by vishal on 18/09/19.
 */
class Pen {

    var ink: Ink? = null
    var refil: Refill? = null

    @Inject
    constructor(ink: Ink?, refil: Refill?) {
        this.ink = ink
        this.refil = refil
    }

    fun write(){
        Log.d("WHATAAA","WRITING....")
    }
}