package com.dlegacy.pphomework

import java.lang.StringBuilder

open class Judet(private val nume : String) : Asezare, Visitable {
    val comune = arrayListOf<Comuna>()
    val orase = arrayListOf<Oras>()

    override fun GetLocuitori(): Int {
        var nrLocuitori = 0

        for(it in comune){
            nrLocuitori += it.GetLocuitori()
        }

        for(it in orase){
            nrLocuitori += it.GetLocuitori()
        }

        return nrLocuitori
    }

    override fun GetNume(): String {
        return nume
    }

    fun AddComuna(comunica: Comuna) {
        comune.add(comunica)
    }

    fun AddOras(orasel: Oras) {
        orase.add(orasel)
    }

    override fun accept(visitor: Visitor): Boolean {
        return visitor.Visit(this)
    }

    override fun toString(): String {
        var stringBuilder : StringBuilder = StringBuilder()
        stringBuilder.append("Judet: [$nume]\n")
        stringBuilder.append("\tComune:\n")
        comune.forEachIndexed { index, comuna -> stringBuilder.append("\t\t$index. $comuna\n") }
        stringBuilder.append("\tOrase componente:\n")
        orase.forEachIndexed { index, oras -> stringBuilder.append("\t\t$index. $oras\n") }
        return stringBuilder.toString()
    }
}

