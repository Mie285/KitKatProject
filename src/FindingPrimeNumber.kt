fun main() {

    val numbers = (1..10).map(::MaybePrimeInt)
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)



    val numbers = (1..100).map(::MaybePrimeInt)
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    //val primeNumbers = numbers.filter(MaybePrimeInt::isPrimeNumber)
    print(primeNumbers)

}