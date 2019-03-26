class TeamDraw(gk: Int, dfd: Int, mid: Int, st: Int) {

  val numOfGoalkeepers = gk
  val numOfDefenders = dfd
  val numOfMidfielders = mid
  val numOfStrikers = st
  val FULL_TEAM = 18

  val team: List[Player] = List()

  def addPlayer(player: Player) = player :: team

  def makeDraw(numOfTeams: Int): List[Player] = ???


}
