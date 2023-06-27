object SquareNumber {

  def main(args: Array[String]): Unit = {
    println("Enter number ")
    val num = scala.io.StdIn.readInt()

     val res = num * num;
    println("The square of " + num + " is " + res);
  }

  }
