object q2 {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(x => x * x) //map method returns a new list with applying the given function for elements
  }
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val squares = calculateSquare(numbers)
    println(squares)
  }
}
