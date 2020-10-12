package date

object UseDate {
  def main(args: Array[String]): Unit = {
    val today = Date(12, 10, 2020)
    println(s"Date has day of ${today.day}")
    val newYearsDay: Date = new Holiday(1, 1, 2021, "new year's day")
//    val newYearsDay: Date = Date(1, 1, 2021)
//    val newYearsDay: Any = 99

    newYearsDay match {
      case x: Holiday => println(x)
      case x: Date => println(s"it's not a holiday but it is a date ${x}")
      case x => println(s"it's something, but not date like ${x}")
    }

    val d2 = Date(12, 10, 2020)
    println(today == d2)
  }
}
