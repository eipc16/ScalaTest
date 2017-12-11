package ScalaPackage

/**
  * Created by epicm on 08.12.2017.
  */
trait Debug {
  def debugName(): Unit = println("Klasa: " + getClass.getSimpleName)
  def debugVars(): Unit = {
    for(v <- getClass.getDeclaredFields) {
      v.setAccessible(true)
      println("Pole: " + v.getName + " => " + v.getType + ", " + v.get(this))
    }
  }
}
