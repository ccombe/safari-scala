package caseclasses

object UseCaseClass {
  def main(args: Array[String]): Unit = {
//    val transport: Any = Truck(1000, 800)
    val transport: Any = Car(5)
    val transport2: Any = Truck(1000, 800)
    val transport3: Any = Truck(1001, 800)
    println(transport)
    println(transport == transport2)
    println(transport == transport3)

    val payload = transport match {
      case Truck(w, v) => w
      case Car(s) => (s - 1) * 170
    }
    println(s"payload of transporter is ${payload}")
  }
}
