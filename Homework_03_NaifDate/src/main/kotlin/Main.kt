package pt.isel

fun main() {
    println(NaifDate(28, 10, 2022).nextMonth()) // 11
    println(NaifDate(28, 11, 2022).nextMonth()) // 12
    println(NaifDate(28, 12, 2022).nextMonth()) // 1

    //println(NaifDate(28, 9, 2022).addDays(73).toString())  // 10-12-2022
    //println(NaifDate(28, 9, 2022).addDays(117).toString()) // 23-01-2023

    val d2 = NaifDate(6, 12, 2021)
    //println(d2.addDays(43).toString()) // 9-2-2023
    println(d2)
    println(d2.addDays(30)) //
}
