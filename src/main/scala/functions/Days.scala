package functions

object Days {
//  def dayOfWeek(day: Int, month: Int): Int = dayOfWeek(day, month, 2020)

  // Zeller's Congruence
  // day of week (0 = Saturday, 6 = Friday)
  def dayOfWeek(day: Int, month: Int, year: Int = 2020): Int = {
    // function args are ** val ** type!
    val (m, y) = if (month < 3) (month + 12, year - 1) else (month, year)
    // no return needed, last expression in block is value of block
    (day + (13 * (m + 1) / 5) + y + y / 4 - y / 100 + y / 400) % 7
  }

  def main(args: Array[String]): Unit = {
    println(s"Day of jan 1 2000 was ${Days.dayOfWeek(1, 1, 2000)}")
    println(s"Day of oct 12 2020 was ${Days.dayOfWeek(month=10, day=12, year=2020)}")
    println(s"Day of oct 12 2020 was ${Days.dayOfWeek(month=10, day=12)}")
  }
}
