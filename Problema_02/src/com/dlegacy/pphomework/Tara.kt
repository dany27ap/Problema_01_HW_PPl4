package com.dlegacy.pphomework

class Tara (val nume : String, val capitala: Capitala, private val judet : Set<Judet> ) : Asezare, Visitable {

    override fun GetLocuitori(): Int {
        var nrLocuitori = capitala.GetLocuitori()
        for(it in judet){
            nrLocuitori += it.GetLocuitori()
        }
        return nrLocuitori
    }

    override fun GetNume(): String {
        return nume
    }

    override fun accept(visitor: Visitor): Boolean {
        return visitor.Visit(this)
    }

    override fun toString(): String {
        var stringBuilder: StringBuilder = StringBuilder()
        stringBuilder.append("Tara: [${this.nume}]\n")
        stringBuilder.append("Capitala: [${this.capitala}]\n")
        stringBuilder.append("--------Judete--------\n")
        judet.forEachIndexed { index, judet -> stringBuilder.append("$index. $judet\n") }
        return stringBuilder.toString()
    }

}