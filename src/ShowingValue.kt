class ShowingValue(num: Int) : PrimeNumberSet(num), PrimeNumber, Outcome {

    override fun showOutcome() {
        println("$num : is prime number")
    }

    var primeNumbers: Boolean = false
    override fun isPrimeNumbers(): Boolean {
        // logic check num is prime number or not
        return primeNumbers
    }
}