package functions {

  class Month(m: Int) {
    val monthInternal = m // "public" fields OK if immutable!
    // with parens? warning about side-effects
    def month: Int = this.monthInternal

    println(s"Constructing a month with m = ${m}")

    def +-+-(m: Int): Boolean = m > 0 && m < 13
  }

  object MonthRunner {
    def main (args: Array[String] ): Unit = {
      val month = new Month(5)
      println(s"month.month is ${month.month}")

      println(s"4 is valid month ? ${month.+-+-(4)}")
      // infix invocation
      println(s"4 is valid month ? ${ month +-+- 4 }")

      println(s"14 is valid month ? ${month.+-+-(14)}")
      println(s"14 is valid month ? ${ month +-+- 14 }")

      Console println "hello"
      Console.println("hello")
    }
  }
}
