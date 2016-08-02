package example

import org.junit.Assert._
import org.junit.Test

class ExampleScalaTest {
  @Test
  def test1() {
    val baz = new BazJ(null)
    val bar = new BarS(baz)
    val foo = new FooJ(bar)
    baz.foo = foo;
    //
    val piyo = new PiyoS(null)
    val fuga = new FugaJ(piyo)
    val hoge = new HogeS(fuga)
    piyo.setHoge(hoge);
    //
    val bob = new BobS(null)
    val alice = new AliceJ(bob)
    bob.setAlice(alice);
    assertEquals("Alice", bob.name);
  }
}
