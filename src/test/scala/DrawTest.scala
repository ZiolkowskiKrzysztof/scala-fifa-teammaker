import scala.io.Source

object DrawTest extends App {

  val lines = Source.fromFile("C:\\Users\\ziooo\\Desktop\\fifa.txt").mkString
  lines.split(" ")

}
