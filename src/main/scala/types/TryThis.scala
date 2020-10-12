package types

object TryThis {
  def main(args: Array[String]): Unit = {
    // Scala hides (many things about Java) distinction between
    // primitive and reference types
//    var number: Int = 99
    var number = 99 // type inference
//    number = "hello" // NOT dynamic typing
    number = number + 1 // expected operators from Java
    number += 1 // assignment operators
//    number++ no pre/post inc/dec operator
    println("value of number is " + number)
    println(s"value of number is $number")
    println(s"value of number is ${number}")
    // f"" prefix does fancy formatting like printf
    println(s"length of 'hello' is ${"hello".length}")

    var longText =
      """
        |hello, this is long
        |text it has three
        |lines""".stripMargin

    println(longText)

    var s1 = "Hello"
    var s2 = "He"
    s2 += "llo"
    println(s1)
    println(s2)
    // Scala "unifies" == -- does content comparison
    // (using java .equals object method--with "Any" as arg type)
    println(s1 == s2)
    // reference comparison
    print(s1.eq(s2))
  }
}
