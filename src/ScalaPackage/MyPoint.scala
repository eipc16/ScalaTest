package ScalaPackage

class MyPoint(xv: Int, yv: Int) extends Debug {
  var x : Int = xv
  var y: Int = yv
  var a: String = "test"

  override def debugName(): Unit = println("Klasa: " + this.getClass.getSimpleName)
  override def debugVars(): Unit = {
    for(v <- this.getClass.getDeclaredFields) {
      v.setAccessible(true)
      println("Pole: " + v.getName + " => " + v.getType + ", " + v.get(this))
    }
  }
}