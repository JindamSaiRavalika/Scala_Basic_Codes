object Sum56to153_9 {

  def main (args: Array[String]):Unit={
    var sum = 0;
    for(i <- 56.to(153) ){
      sum += i;
    }
    println("Total sum from 56 to 153 is " + sum)
  }

}
