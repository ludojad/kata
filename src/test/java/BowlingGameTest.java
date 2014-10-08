import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Przemo on 2014-10-07.
 */

public class BowlingGameTest extends TestCase {

    private BowlingGame g;

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    private void rollSpare() {
        rollMany(2, 5);
    }

    @Before
    protected void setUp() throws Exception {
        g = new BowlingGame();
    }

    @Test
    public void testLooserGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.getScore());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.getScore());
    }

    @Test
    public void testSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.getScore());
    }

    @Test
    public void testStrike() throws Exception {
        g.roll(10); //Strike!
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.getScore());
    }

    @Test
    public void testPerfectGame() throws Exception {
        rollMany(20, 10);
        assertEquals(300, g.getScore());
    }
}
