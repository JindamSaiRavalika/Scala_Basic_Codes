object PrimeNumber {

  def main(args: Array[String]): Unit = {
    println("Enter number ")
    val num = scala.io.StdIn.readInt()

    if (num % 2 == 1)
      println(num + " is the prime number");

    else
      println(num + " is not prime number");

  }
}
