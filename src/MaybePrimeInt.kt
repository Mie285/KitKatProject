class MaybePrimeInt(val value: Int) : MaybePrimeNumber {

    override fun toString(): String {
        return value.toString()
    }

    override fun isPrimeNumber(): Boolean {
        if (value < 2) return false
        for (number in 2..value / 2) {
            if (value % number == 0) {
                return false
            }
        }
        return true
    }
}