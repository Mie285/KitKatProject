fun main() {

    val numbers = (1..10).map(::MaybePrimeInt)
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)

}