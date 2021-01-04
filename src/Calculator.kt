fun main() {
    val numbers = (1..1000).map(::ShowingValue)
    val primeNumbers = numbers.filter(ShowingValue::isPrimeNumbers)
    println(primeNumbers)
}
