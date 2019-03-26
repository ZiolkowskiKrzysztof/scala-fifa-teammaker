import scala.io.Source

class Draw {

  val lines = Source.fromFile("C:\\Users\\ziooo\\Desktop").getLines.toList
  println(lines)

}
