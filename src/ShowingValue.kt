class ShowingValue(num: Int) : PrimeNumberSet(num), PrimeNumbers, Numbers {

    override fun showOutcome() {
        println("$num : is prime number")
    }

    var primeNumbers: Boolean = false
    override fun isPrimeNumbers(): Boolean {
        return primeNumbers
    }
}