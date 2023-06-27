object Series_15 {

  def main (args: Array[String]): Unit = {

    var m = 0;
    var mul = 0;

    for (i <- 2 until 17) {
      println("the number is " + i);
      m = i + 1;
      println("the number is " + m)
      mul =  i * m;
      println("Mul of " + i + " * " + m + " is " + mul);
      }

    }
  }

