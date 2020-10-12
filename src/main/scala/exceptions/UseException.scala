package exceptions

import java.sql.SQLException

object UseException {
  def mightBreak: Unit = {
    if (math.random() > 0.5) throw new SQLException();
  }

  // CHECK OUT IMPLICITS -- caller side default argumetns and conversions...

  def main(args: Array[String]): Unit = {
    // see also Try (capital T) it's a case class!
    // and Optional and Either... All monadic
    try {
      mightBreak
    } catch {
      case x: IllegalArgumentException => println("Bad arg!")
      case x: SQLException => println("Bad SQL")
      case x: Throwable => println("Bad something!")
    } finally {
      println("in finally")
    }
    println("finishing")
  }
}
