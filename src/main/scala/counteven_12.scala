object counteven_12 {
  def main(args: Array[String]): Unit = {

    var count = 0;
    for (i <- 2.to(200)) {
      if (i % 2 == 0) {
        println(i);
        count += 1;
      }
    }
    println("count of even numbers is " + count)
  }
}
