fun main() {
    val numbers = (1..1000).map(::MaybePrimeInt)
    val primeNumbers = numbers.filter(MaybePrimeInt::isPrimeNumber)
    println(primeNumbers)
}
