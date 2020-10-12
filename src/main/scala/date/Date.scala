package date

object Date {
  def apply(d: Int, m: Int, y: Int): Date = {
    validate(d, m, y)
    new Date(d, m, y)
  }
  def validate(d: Int, m: Int, y: Int): Unit = {
    if (d < 1 || d > daysInMonth(m, y)) throw new IllegalArgumentException("Bad day value")
  }
  def isLeap(y: Int): Boolean = y % 4 == 0 && y % 100 != 0 || y % 400 == 0
  def daysInMonth(m: Int, y: Int): Int = m match {
    case 9 | 4 | 6 | 11 => 30
    case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
    case 2 => if (isLeap(y)) 29 else 28
    // would throw match exception if not match is found
    case _ => throw new IllegalArgumentException("Bad month value")
  }
}

//class Date private(private val day: Int, val month: Int, val year: Int)
class Date protected(val day: Int, val month: Int, val year: Int) {
  // overrides MUST use override prefix keyword
  override def toString():String = s"I'm a Date day is ${day}, month is ${month}, year is ${year}"

    // if implementing equals, should implement hashcode
  override def equals(obj: Any): Boolean = obj match {
    case d: Date => day == d.day && this.month == d.month && year == d.year
    case _ => false
  }
}

class Holiday(day: Int, month: Int, year: Int, val name: String) extends Date(day, month, year) {
  def this() { // auxiliary constructor
    this(1, 1, 2021, "Really, it's new years day") // no "super()" option...
  }
  override def toString():String = super.toString() + " which is a hoiday called " + name
}

//class Date(d: Int, m: Int, y: Int) {
//  val day = d
//  val month = m
//  val year = y
//}
