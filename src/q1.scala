object q1 {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(x => x % 2 == 0) //filter method returns a new list with only adding elements which gives true for lambda function
  }
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = filterEvenNumbers(numbers)
    println(evenNumbers)
  }
}
