object q3 {
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(x => isPrime(x)) //filter method returns a new list with only elements which gives true value when it applying into lambda function
  }

  def isPrime(number: Int): Boolean = {
    if (number < 2) {
      return false
    }
    for (i <- 2 until number) {
      if (number % i == 0) {
        return false
      }
    }
    return true
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primes = filterPrime(numbers)
    println(primes)
  }

}
