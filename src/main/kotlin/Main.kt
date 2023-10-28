fun main() {
    fun zad3(d: Int): Int {
        var d = d
        var b = 0
        var r = 1
        var m: Int
        while (d > 0) {
            m = d % 2
            d /= 2
            b += m * r
            r *= 10
        }
        return b
    }
    println(zad3(readln().toInt()))
}