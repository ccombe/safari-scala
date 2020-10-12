package apply

object UsingApply {
  private var countValue:Int = 0
  def count:Int = countValue

  def apply(msg: String, msg2: String): String = {
    println(s"apply called with ${msg} and ${msg2}")
    "joined values " + msg + ", " + msg2
  }

  def update(idx: Int, value: Int): Unit = {
    println(s"updating index ${idx} with value ${value}")
    countValue = value
  }
  def main(args: Array[String]): Unit = {
//    val numbers = Array.apply(1, 3, 5, 7)
    val numbers = Array(1, 3, 5, 7)
    println(s"element 1 is ${numbers(1)}") // square brackets are for generics, not indexes!!!
//    numbers.update(1, 99)
    numbers(1) = 99
    println(s"element 1 is ${numbers(1)}")

//    val rv = UsingApply.apply("hello", "world")
    val rv = UsingApply("hello", "world")
    println(s"returned ${rv}")
    println(s"count value is ${UsingApply.count}")

//    UsingApply.update(0, 99)
    UsingApply(0) = 99
    println(s"count value is ${UsingApply.count}")
  }
}
