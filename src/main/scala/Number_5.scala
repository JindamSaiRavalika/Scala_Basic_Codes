object Number_5 {

  def main(args: Array[String]): Unit = {
   var a = 40;

   if (a > 0 && a < 101) {

     if (a > 89 && a < 101)
       println("Super Smart")
     else if (a > 79 && a < 91)
       println("Smart")
     else if (a > 69 && a < 79)
       println("Smart enough")
     else if (a >= 59 && a < 71)
       println("just Smart")
     else if (a > 34 && a < 61)
       println(" no Smart ")
     else if (a > 0 && a < 36)
       println("dump")
   }
   else
     println("invalid input")
 }
}
