package pt.isel

data class NaifDate(
    private val day: Int,
    private val month: Month,
    private val year: Int)
{
    private val daysInAMonth
        get() = when (month.monthNumber) {
            1,3,5,7,8,10,12 -> 31
            2 -> febLastDay(year)
            else -> 30
        }

 /*   val nextMonth = month.monthNumber % 12 + 1*/
    val nextMonth = month.nextMonth()

    fun addDays(inc: Int) : NaifDate {
        val diff = inc - (daysInAMonth - day + 1)
        return when {
            day + inc <= daysInAMonth -> NaifDate(day + inc, month, year)
            month.monthNumber == 12 -> NaifDate(1, Month.JANUARY, year + 1).addDays(diff)
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

    override fun toString(): String {
        return "$day-${month.monthNumber}-$year"
    }
}