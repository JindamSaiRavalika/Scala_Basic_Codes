object Series_23 {

  def main(args: Array[String]): Unit = {

    for (i <- 5.to(25)) {
      if(i % 2 == 1){
        println("number is " +  i);
        var a =  i * i;
        println("multi of " + i + "^" + i + " is " + a);
      }

    }
  }
}