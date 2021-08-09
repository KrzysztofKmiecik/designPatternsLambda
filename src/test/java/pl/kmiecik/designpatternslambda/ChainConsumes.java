package pl.kmiecik.designpatternslambda;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class ChainConsumes {

    @Test
    public void shouldChainConsumes(){
        Consumer<String> c1 =(String s) -> System.out.println("c1="+s);
        Consumer<String> c2 =(String s) -> System.out.println("c2="+s);
        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("test");
    }

}
