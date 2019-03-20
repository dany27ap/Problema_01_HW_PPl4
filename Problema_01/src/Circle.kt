import java.lang.Math.PI

class Circle(private val v:Double) : Solids{
    override fun GetArea(): Double {
        return PI*v*v;
    }

    override fun GetVolume(): Double {
        return (4/3)*PI*v*v*v;
    }
}