object Number_4{

  def main(args: Array[String]): Unit = {
    var a = 116;
    if (a > 100 && a < 1000) {

      if (a % 2 == 0) {
        var b = a % 3;
        println("remainder is " + b);
      }
      else {
        var c = a % 2;
        println("remainder is " + c);
      }

    }

    else
      println("wrong number");

  }
}
