package com.dlegacy.pphomework
interface Visitor{

    fun Visit(sat : Sat) : Boolean
    fun Visit(oras : Oras) : Boolean
    fun Visit(comuna: Comuna) : Boolean
    fun Visit(capitala : Capitala) : Boolean
    fun Visit(tara: Tara) : Boolean
    fun Visit(judet: Judet) : Boolean

}