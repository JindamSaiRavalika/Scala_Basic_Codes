object sumseries_19 {

  def main (args:Array[String]):Unit= {
    var sum = 0;
    for (i <- 5.to(102)) {
      var a = i * i;
      println("multi of " + i + "*" + i + " is " + a);
      sum += a;
      println("sum of series is " + sum );
    }

  }

}
