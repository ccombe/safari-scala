package functionalstuff

import java.time.LocalDate

object UseList {

  def count(c: Int): Unit = {
    if (c == 0) ()
    else {
      println(c)
      count(c - 1)
    }
  }

  // foreach :)
  def doToAll[T](l:List[T], op: T => Unit): Unit = l match {
    case Nil => ()
    case h :: t => op(h); doToAll(t, op)
  }

  def showAll[T](l:List[T]): Unit = l match {
    case Nil => ()
    case h :: t => println("> " + h); showAll(t)
  }

  def showSome(l:List[String]): Unit = l match {
    case Nil => println("Empty list...")
//    case List() => println("Empty list...")
    case List(x) => println(s"Single item vaule is ${x}")
  }

  def main(args: Array[String]): Unit = {
//    val names = List("Fred", "Jim", "Sheila")
    val names = "Fred" :: "Jim" :: "Sheila" :: Nil

    println(s"first name in list is ${names(0)}")
    // generally (not arrays) scala collections are IMMUTABLE
//    names(0) = "Frederick"

    // :: is RIGHT associative
    // because it has a colon in the right most position...
    //    val moreNames = names.::("Bob").::("Alice")

    val moreNames = "Alice" :: "Bob" :: names

    showAll(Nil)
    println("----------------------")
    showAll(List("Albert"))
    println("----------------------")
    showAll(moreNames)
//    println("----------------------")
//    count(2_000_000_000)
    println("----------------------")
    showAll(List[Any](1,2,"Hello", LocalDate.now))

    //    def timesTwo(x:Int): Int = x * 2
    //    val doubleIt:(Int) => Int = timesTwo

    val doubleIt: (Int) => Int = (x: Int) => x * 2
    val four = doubleIt(2)

    val doubleIt2: (Int) => Int = x => x * 2
    val doubleIt3: Int => Int = x => x * 2
    val doubleIt4: Int => Int = _ * 2

    val addIt: (Int, Int) => Int = _ + _
    val fourAgain = addIt(2, 2)
    println(fourAgain)
    println("-------------------")
//    doToAll(List("Fred", "Jim"), println)
    doToAll(List("Fred", "Jim"), (x:String) =>  println("value is" + x))

//    moreNames.filter(x => x != "Fred").map(_.toUpperCase).foreach(println)
    moreNames filter (x => x != "Fred") map (_.toUpperCase) foreach(println)
  }
}
