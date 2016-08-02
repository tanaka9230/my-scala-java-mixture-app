
package example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void test1() {
        final BazJ baz = new BazJ(null);
        final BarS bar = new BarS(baz);
        final FooJ foo = new FooJ(bar);
        baz.foo = foo;
        //
        final PiyoS piyo = new PiyoS(null);
        final FugaJ fuga = new FugaJ(piyo);
        final HogeS hoge = new HogeS(fuga);
        piyo.setHoge(hoge);
        //
        final BobS bob = new BobS(null);
        final AliceJ alice = new AliceJ(bob);
        bob.setAlice(alice);
        assertEquals("Alice", bob.name());
    }
}
