fun main() {


   val diceController = DiceController()
   print("\nZapočni igru (Enter)")
   readLine()

   for(i in 1..3) {
      println("-----------")
      diceController.rollDice()
      println("-----------")

      ScaleChecker().check(diceController.diceValue)
      JambChecker().check(diceController.diceValue)
      PokerChecker().check(diceController.diceValue)

      if(i < 3) {
         println("Odaberi kockice koje ne želiš ponovno bacati (e.g. 1,3,5) ili baci sve (Enter)")
         var diceForLock = readLine()!!.replace(",", "")
         diceController.lockDice(diceForLock)
      }
      else{
         println("Igra gotova!")
      }

   }

}

