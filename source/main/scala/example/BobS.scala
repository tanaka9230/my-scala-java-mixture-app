package example

case class BobS(var alice: AliceJ) {
  def setAlice(anAlice: AliceJ) {
    alice = anAlice
  }

  def name = alice.name();
}
