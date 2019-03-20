package com.dlegacy.pphomework

import java.lang.StringBuilder

class Comuna(private val nume : String) : Asezare, Visitable {

    private val sat : ArrayList<Sat> = ArrayList<Sat>()

    override fun GetNume(): String {
        return nume;
    }

    override fun GetLocuitori(): Int {
        var loc = 0
        sat.forEach{
            loc += it.GetLocuitori()
        }
        return loc
    }

    fun AddSat(satuc: Sat) {
        sat.add(satuc)
    }

    override fun accept(visitor: Visitor): Boolean {
        return visitor.Visit(this)
    }

    override fun toString(): String {
        var stringBuilder : StringBuilder = StringBuilder()
        stringBuilder.append("\tComuna: [$nume]\n")
        stringBuilder.append("Sate componente: \n")
        sat.forEachIndexed { index, sat ->  stringBuilder.append("$index. $sat")}
        return stringBuilder.toString()
    }

}