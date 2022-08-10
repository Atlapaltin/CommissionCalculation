import junit.framework.TestCase.assertEquals
import org.junit.Test

class CommissionTest {
    @Test
    fun totalCommissionVisa() {
        // 1 - arrange
        val card: String = "Visa"
        val totalTransfer: Int = 35_000 * 100
        val transfer: Int = 15_000 * 100

        // 2 - act
        val res = totalCommission(card, totalTransfer, transfer)

        // 3 - assert
        assertEquals(11250,res)
    }

    @Test
    fun totalCommissionMaestro() {
        // 1 - arrange
        val card: String = "Maestro"
        val totalTransfer: Int = 75_000 * 100
        val transfer: Int = 15_000 * 100

        // 2 - act
        val res = totalCommission(card, totalTransfer, transfer)

        // 3 - assert
        assertEquals(9020, res)
    }

    @Test
    fun totalCommissionVK() {
        // 1 - arrange
        val card: String = "Maestro"
        val totalTransfer: Int = 35_000 * 100
        val transfer: Int = 15_000 * 100

        // 2 - act
        val res = totalCommission(card, totalTransfer, transfer)

        // 3 - assert
        //assertEquals(0, res)
        assertEquals(1, res)
    }
}