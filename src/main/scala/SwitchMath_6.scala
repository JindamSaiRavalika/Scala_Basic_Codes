object SwitchMath_6 {

  def main(args: Array[String]): Unit = {
    println("Enter number 1")
    val num1 = scala.io.StdIn.readInt()
    println("Enter number 2")
    val num2 = scala.io.StdIn.readInt()
    println("Operator")
    val symbol = scala.io.StdIn.readLine()

   val result = symbol match{
        case "+" => num1 + num2
        case "-" => num1 - num2
        case "*" => num1 * num2
        case "/" => num1 / num2
        case "%" => num1 % num2
        case _ => "Invalid operation"
    }
    println("result : " + result);

  }
}
