object series_24 {
  def main(args: Array[String]): Unit =
    for(j <-1.to(7))
    for (i <- 5.to(10)) {
      if (i % 5 == 0) {
        print(i + ",");
      }

    }

}
