package com.chat.me.daggerwithkotlin.component

import com.chat.me.daggerwithkotlin.models.Pen
import dagger.Component

/**
 * Created by vishal on 18/09/19.
 */
@Component
interface PenComponent {

    fun getPen(): Pen
}