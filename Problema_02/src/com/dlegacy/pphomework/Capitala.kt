package com.dlegacy.pphomework

class Capitala (private var nume : String, private val an : Int) : Judet(nume),
    Visitable {

    fun GetAn() : Int {
        return an;
    }

    override fun accept(visitor: Visitor): Boolean {
        return visitor.Visit(this)
    }

    override fun toString(): String {
        return "Capitala: [$nume Resedinta din $an]"
    }

}