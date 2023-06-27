object even382to582_16 {

  def main(args: Array[String]): Unit = {
    var sum = 0;
    var count = 0;
    for (i <- 382.to(582)) {
      if (i % 2 == 0) {
        // println(i);
        sum += i;
        count += 1;
      }
    }
    println("count is " + count);
    println("sum of numbers is " + sum);
  }
}
