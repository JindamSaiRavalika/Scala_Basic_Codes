object series_28 {

  def main(args: Array[String]): Unit = {
    for (i <- 1.to(25)) {
      if (i % 5 == 0)
        print("divisible by five,");

      else if (i % 2 == 1)
          print(i + ",");


    }
  }
}
