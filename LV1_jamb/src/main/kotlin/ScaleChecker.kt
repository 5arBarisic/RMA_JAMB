class ScaleChecker:IChecker {

    override fun check(dice: MutableList<Die>): Boolean {

        var scaleList = mutableListOf<Int>()
        for (i in 0..5){
            scaleList.add(dice[i].number)
        }
        scaleList.sort()
        scaleList= scaleList.distinct() as MutableList<Int>

        if(scaleList.size==6){

            println("Velika skala!")

            return true
        }
        if(scaleList.size==5){
            if(scaleList[0]==2){

                println("Velika skala!")

            }else if(scaleList[4]==5){

                println("Mala skala!")
            }
            return true
        }

      return false
    }


}