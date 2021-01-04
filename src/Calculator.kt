fun main() {

    val setOfNumbers = listOf(
        ShowingValue(2), ShowingValue(3), ShowingValue(5),
        ShowingValue(7), ShowingValue(11), ShowingValue(13),
        ShowingValue(17), ShowingValue(19), ShowingValue(23),
        ShowingValue(29), ShowingValue(31), ShowingValue(37),
        ShowingValue(41), ShowingValue(59), ShowingValue(61),
        ShowingValue(67), ShowingValue(71), ShowingValue(73),
        ShowingValue(79), ShowingValue(83), ShowingValue(89),
        ShowingValue(97)
    )

    val inputNumbers = listOf<Int>(2, 4, 5, 6);
    val num2 = inputNumbers.filter { isPrimeNumber(it) }
    println(num2);

    val num = setOfNumbers.filter { it.isPrimeNumbers() }
    for (set in num) {
        set.showOutcome()
    }


}

fun isPrimeNumber(input:Int):Boolean{

    return false;
}
