fun main() {

    val numbers = (1..100).map(::MaybePrimeInt)
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)
}