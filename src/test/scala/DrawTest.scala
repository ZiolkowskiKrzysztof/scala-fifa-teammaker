import scala.collection.mutable.ListBuffer
import scala.io.Source

object DrawTest extends App {

  val data = Source.fromFile("C:\\Users\\ziooo\\Desktop\\fifa.txt").mkString
  val lines = data.split("\n")

  println(lines(3))
  println()

  val name = "([A-Z][a-z]+)".r
  val ovr = "([0-9]+)".r
  val position = "([a-z][a-z])".r

  var names = new ListBuffer[String]
  var ovrs = new ListBuffer[String]
  var positions = new ListBuffer[String]

  def filt(x: String) = x match {
    case name(x) => names += x
    case ovr(x) => ovrs += x
    case position(x) => positions += x
    case _ => "dontknow"
  }


  val line0 = lines(0).split(" ")

  line0.foreach(println)

  println(filt(line0(2)))

  for (elem <- lines) {
    elem.split(" ").foreach(filt)
  }

  println(names)
  println(ovrs)
  println(positions)



}
