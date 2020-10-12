package hello

class Hello // called "companions" share private access

// no "public" keyword (public is default!)
// object is used to contain "static"-like features
object Hello { // objects are Singletons, can pair with classes of same name
  // square brackets for generics, arrays behave like other collections
  // "math" (lambda calculus) "defines" afunction as an equality
  // in pure fp add(1,2) is exactly equivalent to 1 + 2
  // all functions "appear" to return something, Unit is the *value*
  // representing "nothing to see here"
  def main(args: Array[String]): Unit = {
    println("Hello Scala World!")
    // literal value for Unit (also a singleton!)
    println( () )
  }
}
