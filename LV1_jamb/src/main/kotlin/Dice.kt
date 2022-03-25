open class Dice {

    var diceValue = mutableListOf<Die>()

    init {
        for (i in 1..6) {
            diceValue.add(Die())
        }
    }
    fun get():List<Die>{
        return diceValue
    }

}
