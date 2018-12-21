import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class PetRockTest {
      private PetRock rockey = new PetRock("Rockey");

    @Before
    public void setUp() throws Exception {
        rockey= new PetRock("Rockey");
    }

    @Test
    public void getName() {

        assertEquals("Rockey",rockey.getName());
    }

    @Test
    public void testUnhappyToStart() {
        PetRock rockey = new PetRock("Rockey");

        assertFalse(rockey.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
        rockey.playWithRock();
        assertTrue(rockey.isHappy());
    }

    @Test
    public void testPlay() {
        rockey.playComputer();
        assertTrue(rockey.isHappy());
    }

    @Test
    public void testAdd() {
        rockey.add(4,5);
        assertEquals(9,4,5);
    }

    @Test (expected = IllegalStateException.class)
    public void name() {
        rockey.printHappyMessage();
    }

    @Test
    public void testGet() {
        rockey.getMessage();
        String str = rockey.getMessage();
        assertEquals("I am happy",str);
    }

    @Test
    public void testFavNumber() {
        int k =rockey.getFavNumber();
        assertEquals(42,k);
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintHappyMessage() {
        rockey.printHappyMessage();

    }
}