import org.junit.jupiter.api.Test
import pt.isel.NaifDate
import kotlin.test.*

class NaifDateTest {
    @Test
    fun `returns correct date` () {
        val date = NaifDate(10,8,1997)
        assertEquals("10-8-1997", date.toString())
    }

    @Test
    fun `correctly computes the following month` () {
        val date = NaifDate(20,10,2004)
        val nextMonth = date.nextMonth()
        assertEquals(11, nextMonth)
    }

    @Test
    fun `increments by the correct number of days` () {
        val date = NaifDate(10,8,1997)
        val incrementedDate = date.addDays(10)
        assertEquals("20-8-1997", incrementedDate.toString())
    }

    @Test
    fun `increments by the correct number of days in the following year` () {
        val date = NaifDate(6,12,2021)
        val incrementedDate = date.addDays(30)
        assertEquals("5-1-2022", incrementedDate.toString())
    }


}
