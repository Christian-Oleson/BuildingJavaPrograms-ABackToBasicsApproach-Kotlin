package soloLearn

class WaterConsumption(private val waterConsumerPerDay: Int, private val numberOfYears: Int) {
    val daysInYear = 365

    fun calculateFamilyWaterConsumption() : Int {
        return daysInYear * waterConsumerPerDay * numberOfYears
    }
}