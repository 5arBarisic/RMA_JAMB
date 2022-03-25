class PokerChecker:IChecker {

    override fun check(dice: MutableList<Die>):Boolean {
        for (i in 1..6){
            var count = 0
            for (j in 1..6){
                if (dice[j-1].number == i) {
                    count++;
                    if( count > 3 ) {
                        println("Poker!")
                        return true
                    }
                }
            }
        }
        return false
    }
}