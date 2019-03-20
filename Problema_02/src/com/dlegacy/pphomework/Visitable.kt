package com.dlegacy.pphomework

interface Visitable {

    fun accept(visitor: Visitor) : Boolean

}