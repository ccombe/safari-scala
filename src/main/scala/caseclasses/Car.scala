package caseclasses

case class Car(seats: Int) {
  def openTrunk:Unit = {
    println("opening the back of car")
  }
}
