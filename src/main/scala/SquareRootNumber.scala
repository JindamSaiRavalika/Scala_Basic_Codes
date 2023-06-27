object SquareRootNumber {

  def main(args: Array[String]): Unit = {
    println("Enter number ")
    val num = scala.io.StdIn.readInt()

     val res = scala.math.sqrt(num)
    println(" The square root of num is "+ res);

  }
}
