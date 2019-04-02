class User(sign: String, gk: Int, df: Int, md: Int, st: Int) {

  val name = sign
  val goalkeepers = gk
  val defenders = df
  val midfielders = md
  val strikers = st

  val team: List[Player] = ???

  def showTeam() = team.foreach(println)
}
