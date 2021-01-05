fun main() {
<<<<<<< HEAD
    val numbers = (1..100).map(::MaybePrimeInt)
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    //val primeNumbers = numbers.filter(MaybePrimeInt::isPrimeNumber)
    print(primeNumbers)
=======

    val numbers = (1..10).map(::MaybePrimeInt)
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)

>>>>>>> f578be90ef7c1e0063c8a51ff71452d457d448a8
}