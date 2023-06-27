object avg_18 {

  def main(args:Array[String]): Unit = {
    var sum = 0;
    var avg = 0;
    var count = 0;
    for(i <- 24.to(100)){
      if( i % 2 == 0){
     // println(i);
        sum += i;
        count +=1;
      }
    }
     avg = sum/count;
    println("count is " + count);
    println("sum of numbers is " + sum);
    println("Avg of numbers is " + avg)
  }

}
