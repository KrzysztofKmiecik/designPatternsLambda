package pl.kmiecik.designpatternslambda;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class ChainConsumes {

    @Test
    public void shouldChainConsumesTooLong(){
        Consumer<String> c1 =(String s) -> System.out.println("c1="+s);
        Consumer<String> c2 =(String s) -> System.out.println("c2="+s);
        Consumer<String> c3 = (String s) ->{
            c1.accept("aaa");
            c2.accept("bbb"+ s);
        };
        c3.accept("test");
    }

    @Test
    public void shouldChainConsumes(){
        Consumer<String> c1 =(String s) -> System.out.println("c1="+s);
        Consumer<String> c2 =(String s) -> System.out.println("c2="+s);
        Consumer<String> c3 = (String s) ->{
            c1.accept("aaa");
            c2.accept("bbb"+ s);
        };
        c3.accept("test");
    }



}
