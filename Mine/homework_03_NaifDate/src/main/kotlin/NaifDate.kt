package pt.isel


data class NaifDate(
    private val day: Int,
    private val month: Int,
    private val year: Int)
{
    // FIELD: private final int daysInAMonth;
    //    private val daysInAMonth = when (month) {
    // FUNCTION: private final int getDaysInAMonth();
    private val daysInAMonth
        get() = when (month) {
            1,3,5,7,8,10,12 -> 31
            2 -> febLastDay(year)
            else -> 30
        }

    val nextMonth = month % 12 + 1

  /*  fun addDays(days: Int): NaifDate {
        var d = day
        var m = month
        var y = year
        var inc = days
        while(d + inc > daysInAMonth(m, y)) {
            inc -= (daysInAMonth(m, y) - d)
            d = 1
            m = m %12 + 1
            if(m == 1) {
                y++
                d = 0
            }
        }
        // outra opção:
        // d += inc e remover o -d e o d = 0
        return NaifDate(d + inc, m, y)
    }*/

    fun addDays(inc: Int) : NaifDate {
        val diff = inc - (daysInAMonth - day + 1)
        return when {
            day + inc <= daysInAMonth -> NaifDate(day + inc, month, year)
            month == 12 -> NaifDate(1, 1, year + 1).addDays(diff)
            else -> NaifDate(1, nextMonth, year).addDays(diff)
        }
    }

    private fun febLastDay(year: Int): Int {
        return if(isLeapYear(year)) 29
        else 28
    }
    private fun isLeapYear(year: Int): Boolean {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
    }

    /*
    override fun equals(other: Any?): Boolean {
        if(other !is NaifDate) return false
        return this.day == other.day
                && this.month == other.month
                && this.year == other.year
    }
*/
    override fun toString(): String {
        return "$day-$month-$year"
    }
}