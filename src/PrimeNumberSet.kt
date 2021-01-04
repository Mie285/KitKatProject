class PrimeNumberSet (num : Int) : Checking, Numbers {

    override fun number(){
        println("$num : is prime number")
    }

    var primeNumbers : Boolean = true
    override fun isPrimeNumbers(): Boolean {
        return primeNumbers
    }
}