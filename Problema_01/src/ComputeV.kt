class ComputeV(val shapes: Array<SolidShape>) : ComputeData{
    override fun Sum(): Double {
        var sum = 0.0
        for (shape in shapes) {
            sum += shape.GetVolume()
        }
        return sum
    }
}