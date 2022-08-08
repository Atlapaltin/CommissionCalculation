fun main() {

    val totalTransfer = 75_000 * 100
    val transfer = 15_000 * 100
    val card = "VK Pay"
    val commission = totalCommission(card,totalTransfer, transfer)

    println("По карте $card общая сумма переводов за месяц составила $totalTransfer., сумма совершаемого перевода: $transfer. Комиссия за перевод: $commission")
}

fun totalCommission(card: String = "VK Pay", totalTransfer: Int = 0, transfer: Int): Int {
    var commission = 0

    commission = when(card) {
        "Mastercard", "Maestro" -> when {
            (totalTransfer + transfer) in 300 * 100..75_000 * 100 -> 0
            else -> (transfer * 0.6 / 100 + 20).toInt()
        }
        "Visa", "Mir" -> when {
            0.75 * transfer < 35 * 100 -> 35 * 100
            else -> (0.75 / 100 * transfer).toInt()
        }
        else -> 0
    }

    return commission
}