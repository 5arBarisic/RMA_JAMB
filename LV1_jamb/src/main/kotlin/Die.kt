import java.util.Random

open class Die {

    var number = 0
    var locked= false


    fun isLocked():Boolean{

        return locked
    }
    fun lockIt(){
        locked = true
    }

    fun roll():Int {
        number = Random().nextInt(1, 7)
        return number
    }

}

