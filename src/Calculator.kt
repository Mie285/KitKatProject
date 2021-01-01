fun main() {

    val set_of_numbers = listOf(
            ShowingValue(2), ShowingValue(3), ShowingValue(5),
            ShowingValue(7), ShowingValue(11), ShowingValue(13),
            ShowingValue(17), ShowingValue(19), ShowingValue(23),
            ShowingValue(29), ShowingValue(31), ShowingValue(37),
            ShowingValue(41), ShowingValue(59), ShowingValue(61),
            ShowingValue(67), ShowingValue(71), ShowingValue(73),
            ShowingValue(79), ShowingValue(83), ShowingValue(89),
            ShowingValue(97)
    )
    
    val prime_number = set_of_numbers.filter { it.isprimeNumbers() }
    for (set in prime_number){
        set.number()
    }
}
