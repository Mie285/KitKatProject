class CheckingPrimeNumber(num: Int) : PrimeNumberSet(num), Checking, Numbers{

    override fun number(){
        println("$num : is prime number")
    }

    var primeNumbers : Boolean = false
    override fun isprimeNumbers(): Boolean {
        return primeNumbers
    }
}