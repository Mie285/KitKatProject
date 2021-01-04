fun main() {

    val set_of_numbers = listOf(
            PrimeNumberSet(2), PrimeNumberSet(3), PrimeNumberSet(5),
            PrimeNumberSet(7), PrimeNumberSet(11), PrimeNumberSet(13),
            PrimeNumberSet(17), PrimeNumberSet(19), PrimeNumberSet(23),
            PrimeNumberSet(29), PrimeNumberSet(31), PrimeNumberSet(37),
            PrimeNumberSet(41), PrimeNumberSet(59), PrimeNumberSet(61),
            PrimeNumberSet(67), PrimeNumberSet(71), PrimeNumberSet(73),
            PrimeNumberSet(79), PrimeNumberSet(83), PrimeNumberSet(89),
            PrimeNumberSet(97)
    )
    
    val prime_number = set_of_numbers.filter { it.isPrimeNumbers() }
    for (set in prime_number){
        set.number()
    }
}
