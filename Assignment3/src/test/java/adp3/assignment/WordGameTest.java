package adp3.assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WordGameTest {
    private WordGame words;
@Before
public void setUp() throws Exception{
    words = new WordGame();
}

    @Test
    public void testEqual(){
    String results = words.strings("a","a");
       Assert.assertEquals(results,true,"string1 == string2 ");
    }
    @Test
    public void testIdentity(){
        String results = words.strings("ab","cd");
       // Assert.assertNotSame(results,true,"string1 is not same to string2");
        Assert.assertNotSame(results,true);
    }
    @Test(timeout=20)
    public void testTimeOut(){
        int results = words.stringLenght("String1");
        assertEquals(results,7);}
    @Test
    public void testFail(){
        String results = words.strings("ab","cd");
        Assert.fail("This test will fail");
    }
    @Ignore
    @Test
    public void testDisabling(){
        int results = words.stringLenght("String1");
        assertEquals(results,7);
    }





}
