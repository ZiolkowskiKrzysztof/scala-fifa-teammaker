import scala.io.Source

class Draw {

  val players = Source.fromFile("C:\\Users\\ziooo\\Desktop\\fifa.txt").mkString
  players.split(" ").foreach(println)

}
