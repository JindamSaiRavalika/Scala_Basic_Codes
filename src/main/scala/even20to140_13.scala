object even20to140_13 {
  def main(args: Array[String]): Unit = {

    var count = 0;
    for (i <- 20.to(140)) {
      if (i % 2 == 0) {
        if(count % 2 == 0)
        println(i);
        count +=1;
      }
    }

  }

}
