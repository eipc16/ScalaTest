package ScalaPackage

/**
  * Created by epicm on 08.12.2017.
  */
trait Debug {
  def debugName(): Unit = println("Klasa: " + getClass.getSimpleName)
  def debugVars(): Unit = {
    getClass.getDeclaredFields.foreach( v => List.apply(v).map(v => {
      v.setAccessible(true)
      "Pole: " + v.getName + " => " + v.getType + ", " + v.get(this)
    }).foreach(s => println(s)))
  }
}
