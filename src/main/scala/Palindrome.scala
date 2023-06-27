object Palindrome {

  def main(args:Array[String]):Unit={
    println("Enter number ")
    val num = scala.io.StdIn.readLine()
    val a = num.reverse;

    if(a == num)
      println("The number " + num + " is palindrome")

    else
      println("The number " + num + " is not palindrome")

  }

}
