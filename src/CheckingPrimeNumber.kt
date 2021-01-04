class CheckingPrimeNumber(num: Int) : Checking, Numbers{

    override fun number(){
        println("$num : is prime number")
    }

    var primeNumbers : Boolean = false

    override fun isPrimeNumbers(): Boolean {
        return primeNumbers
    }

}