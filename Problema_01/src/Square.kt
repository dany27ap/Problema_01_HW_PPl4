class Square(val v:Double) : Solids{
    override fun GetArea(): Double {
        return v*v;
    }

    override fun GetVolume(): Double {
        return v*v*v;
    }
}