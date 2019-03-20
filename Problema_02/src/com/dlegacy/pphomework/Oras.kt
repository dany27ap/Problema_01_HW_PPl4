package com.dlegacy.pphomework

class Oras(val name : String, val locuitori : Int, val blocuri : Int, val spitale : Int) : Asezare,
    Visitable {

    override fun GetLocuitori(): Int {
        return locuitori
    }

    override fun GetNume(): String {
        return name
    }

    fun GetSpitale() : Int {
        return spitale
    }

    fun GetBlocuri() : Int {
        return  blocuri
    }

    override fun accept(visitor: Visitor): Boolean {
        return visitor.Visit(this)
    }

    override fun toString(): String {
        return "Oras: [$name], Locuitori: [$locuitori], Nr_Blocuri: [$blocuri], Spitale[$spitale]\n"
    }

}