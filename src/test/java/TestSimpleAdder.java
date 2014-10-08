import org.junit.Assert;
import org.junit.Test;

public class TestSimpleAdder {

SimpleAdder result = new SimpleAdder();
    @Test
    public void simple_test_should_pass(){

        String expected = "Hello, JUnit!";
        String hello = "Hello, JUnit!";
        Assert.assertEquals(hello, expected);
    }

    @Test
    public void should_be_two_when_add_one_to_one(){
        Assert.assertEquals("2", result.add("1,1"));
    }

    @Test
    public void empty_string_should_be_zero(){
        Assert.assertEquals("1",result.add(",1"));
    }

    @Test
    public void many_strings_numbers_should_be_allowed() {
        Assert.assertEquals("4", result.add("1,1,1,0,1"));
    }
}
