object TeamDrawTest extends App {

  val testPlayer = new Player("Lewandowski", 90, "st")

  val testTeam = new TeamDraw(2, 5, 6, 5)
  testTeam.addPlayer(testPlayer)

  println(testTeam.team)

  val team: List[Player] = List()
  val team1 = testPlayer :: team
  println(team1)

}
