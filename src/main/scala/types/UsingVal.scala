package types

object UsingVal {
  def showAll(count: Int): Unit = {
    if (count > 0) {
      println(count)
      showAll(count - 1)
    }
  }
  def main(args: Array[String]): Unit = {
    val x = 99 // equivalent to a "final" in Java, "const" in javascript/C#
    println(x)
//    x += 10
//    println(x)
    val s = new StringBuilder("Hello")
//    s = null
    s.append(" world")
    println(s)

    val initialBalance = 1000
    val balanceAfterWithdrawal = initialBalance - 100

    var count = 3
    while (count > 0) {
      println(count)
      count -= 1
    }
    println("------------")
    showAll(4)
    val v: Any = 99
    val message = if (v == 99) { // if is "ternary" operator
      "it's 99"
    } else {
      "it's not 99"
    }

    println(s"message is ${message}")

    val t1 = println("Strange")
    val t = {
      println("Calculating t")
      99
    }
    println(t)
  }
}
