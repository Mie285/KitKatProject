class CheckingPrimeNumber(num: Int) : PrimeNumberSet(num), PrimeNumbers, Numbers{

    override fun showOutcome(){
        println("$num : is prime number")
    }

    var primeNumbers : Boolean = true
    override fun isPrimeNumbers(): Boolean {
        return primeNumbers
    }
}