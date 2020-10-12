package functions

object VarArgs {
  def many(a: Int*): Unit = {
    var idx = 0
    while (idx < a.length) {
      println(s"> ${a(idx)}")
      idx += 1
    }
  }
  def main(args: Array[String]): Unit = {
    many(1, 2, 3)
    val list = List(3, 5, 7, 9)
    many(list:_*)

  }
}
