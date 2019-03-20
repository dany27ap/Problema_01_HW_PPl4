class ComputeA(val shapes: Array<NonSolidShape>) : ComputeData{
    override fun Sum() : Double {
        var sum = 0.0
        shapes.forEach { sum+=it.GetArea() }
        return sum
    }
}