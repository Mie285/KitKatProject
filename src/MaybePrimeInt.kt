class MaybePrimeInt(val value: Int) : MaybePrimeNumber {
<<<<<<< HEAD
=======

>>>>>>> f578be90ef7c1e0063c8a51ff71452d457d448a8
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