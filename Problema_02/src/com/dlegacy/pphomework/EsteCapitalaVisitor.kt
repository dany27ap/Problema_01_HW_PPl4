package com.dlegacy.pphomework

class EsteCapitalaVisitor() : Visitor {

    override fun Visit(sat : Sat) : Boolean {
        return false
    }

    override fun Visit(oras : Oras) : Boolean {
        return  false
    }

    override fun Visit(comuna : Comuna) : Boolean {
        return  false
    }

    override fun Visit(capitala: Capitala) : Boolean {
        return  true
    }

    override fun Visit(judet: Judet) : Boolean {
        return  false
    }

    override fun Visit(tara: Tara) : Boolean {
        return  false
    }
}