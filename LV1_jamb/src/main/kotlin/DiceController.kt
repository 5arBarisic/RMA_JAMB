 open class DiceController: Dice() {

     fun rollDice() {

          for (i in 1..6) {
               if(!diceValue[i-1].isLocked()){
                    diceValue[i - 1].roll()
                    print("${diceValue[i-1].number} ")
               }
               else {
                    print("${diceValue[i - 1].number} ")
               }

          }
          println()
     }

      fun lockDice(index:String){

           val n = index.length
           for (i in 1..n) {
                diceValue[index[i - 1].digitToInt() - 1].lockIt()

           }
      }



}