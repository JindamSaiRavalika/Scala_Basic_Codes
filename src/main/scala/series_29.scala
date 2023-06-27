object series_29 {

  def main(args:Array[String]):Unit={

    for( i <- 5.to(51)){

       if(i%2 !=0){
         val a = i.toDouble
         var b = a/10;
         println("the value is " + b);
         var c = b * b;
         println("the value of "+ b + " * " + b + " is " + c)
       }
      }


  }

}
