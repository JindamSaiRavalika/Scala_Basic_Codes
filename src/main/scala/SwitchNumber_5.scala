object SwitchNumber_5 {

  def main(args: Array[String]): Unit = {
    var a = 86;

    a match{
      case x if(x >= 90 && x<= 100) => println("Super Smart");
      case x if(x >=80 && x < 90) => println("Smart");
      case x if(x >=70 && x < 89) => println("Smart enough");
      case x if(x >=60 && x < 69) => println("just Smart");
      case x if(x >=35 && x < 59) => println("no Smart");
      case x if(x >=0 && x < 35) => println("dump");
    }

  }


}
