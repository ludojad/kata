import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Przemo on 2015-02-24.
 */
public class SimpleAdderTest extends TestCase {

    private SimpleAdder a;

    @Before
    protected void setUp() throws Exception {
        a = new SimpleAdder();
    }

    @Test
    public void testAddPair() throws Exception {
        assertEquals("2", a.add("1,1"));
    }

    @Test
    public void testAddSingle() throws Exception {
        assertEquals("5", a.add("5"));
    }

    @Test
    public void testAddMultiple() throws Exception {
        assertEquals("6", a.add("1,2,3"));
    }
}
