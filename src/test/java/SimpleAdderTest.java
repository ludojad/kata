import junit.framework.TestCase;
import org.junit.Assert;
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
    public void testAdder() throws Exception {

        Assert.assertEquals("2", a.add("1,1"));
    }
}
