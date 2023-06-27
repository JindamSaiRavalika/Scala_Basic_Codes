object biggestnumber_3 {

  def main(args: Array[String]): Unit = {

    val a = 30;
    val b = 60;
    val c = 100;
    if (a > b && a > c) {
      println("largest number is " + a)
    }
    else if (b > c && b > a) {
      println("largest number is " + b)
    }
    else {
      println("largest number is " + c)
    }
  }
}
