object Series_22 {

  def main(args: Array[String]): Unit = {

    for (i <- 100.to(10000)) {
      if (i % 100 == 0) {
        println(i);
      }
    }
  }
}
