import org.junit.Test;

import static org.junit.Assert.*;

public class Oct10HomeworkTest {

    @Test
    public void alternateStringsTest1() {
        String result = Oct10Homework.alternateStrings("Thereee", "xxxx");
        assertEquals( "Txhxexrxeee", result);
    }

    @Test
    public void alternateStringsTest2(){
        String result = Oct10Homework.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStringsTest3(){
        String result = Oct10Homework.alternateStrings("Hi", "There");
        assertEquals( "HTihere", result);
    }

    @Test
    public void alternateStringsTest4(){
        String result = Oct10Homework.alternateStrings("xxxx", "Thereee");
        assertEquals( "xTxhxexreee", result);
    }

    @Test
    public void dotBeforeABCTest1() {
        boolean result = Oct10Homework.dotBeforeABC("abc123");
        assertEquals(true, result);

    }

    @Test
    public void dotBeforeABCTest2(){
        boolean result = Oct10Homework.dotBeforeABC("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void dotBeforeABCTest3(){
        boolean result = Oct10Homework.dotBeforeABC("abc.123");
        assertEquals(true, result);

    }
}