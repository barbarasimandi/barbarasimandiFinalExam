import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ReverserTest {

    Reverser reverser;
    String somethingInWrongOrderTest;
    String booleanTest;

    @Before
    public void setUp() throws Exception {
        reverser = new Reverser();
        somethingInWrongOrderTest = "yeh";
        booleanTest = "iah";
    }

    @Test
    public void testReverse() {
        assertEquals("hey", reverser.reverse(somethingInWrongOrderTest));
    }

    @Test
    public void testIfTrue() {
        assertTrue("hai", reverser.reverse(booleanTest).equals("hai"));
    }
}