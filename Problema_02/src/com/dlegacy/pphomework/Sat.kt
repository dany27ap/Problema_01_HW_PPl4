package com.dlegacy.pphomework

class Sat(private val nume : String, private val locuitori : Int, private val case : Int) : Asezare,

    Visitable {
    override fun GetNume(): String {
        return nume;
    }

    override fun GetLocuitori(): Int {
        return locuitori
    }

    fun GetNumarCase() : Int {
        return case
    }

    override fun accept(visitor: Visitor): Boolean {
        return visitor.Visit(this)
    }

    override fun toString(): String {
        return "Nume: [$nume], Locuitori: [$locuitori], Nr_Case: [$case]\n"
    }

}