class Player(playerName: String, playerOvr: Int, playerPosition: String) {
  val name: String = playerName
  val ovr: Int = playerOvr
  val position: String = playerPosition

  override def toString: String = name + "  |  " + ovr + "  |  " + position
}
