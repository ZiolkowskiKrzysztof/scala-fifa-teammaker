import scala.collection.mutable.ListBuffer
import scala.io.Source

class Draw {

  // Patterns
  val name = "([A-Z][a-z]+)".r
  val ovr = "([0-9]+)".r
  val position = "([a-z][a-z])".r

  private val data = Source.fromFile("C:\\Users\\ziooo\\Desktop\\fifa.txt").mkString
  // TODO: source must be given as value
  private val lines = data.split("\n")

  private var names = new ListBuffer[String]
  private var ovrs = new ListBuffer[Int]
  private var positions = new ListBuffer[String]

  /**
    * This method filters type of strings in data file.
    * @param x input text
    * @return type of data
    */
  private def filt(x: String) = x match {
    case name(x) => names += x
    case ovr(x) => ovrs += x.toInt
    case position(x) => positions += x
    case _ => "dontknow"
      // TODO: Add exception
  }

  for (elem <- lines) {
    elem.split(" ").foreach(filt)
  }

  val fullListOfPlayers = (names, ovrs, positions).zipped.toList

  def showListOfPlayers() = fullListOfPlayers.foreach(println)
}
