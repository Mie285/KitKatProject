fun main() {

<<<<<<< HEAD
    val numbers = (1..100).map (::MaybePrimeInt)
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)
}

=======
    val numbers = (1..100).map { MaybePrimeInt(it) }
    val primeNumbers = numbers.filter { it.isPrimeNumber() }
    print(primeNumbers)
}
>>>>>>> 640f06a8ad4841c9ca157dccd2c26882f4b62577
