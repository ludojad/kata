import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemo on 2014-10-18.
 */
public class PrimeFactorsTest extends TestCase{

    //VarArg method (takes as many number of parameters as you give)
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i: ints) {
            list.add(i);
        }
        return list;
    }

    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generatePrimes(1));
    }
    public void testTwo() throws Exception {
        assertEquals(list(2), PrimeFactors.generatePrimes(2));
    }
    public void testThree() throws Exception {
        assertEquals(list(3), PrimeFactors.generatePrimes(3));
    }
    public void testFour() throws Exception {
        assertEquals(list(2,2), PrimeFactors.generatePrimes(4));
    }

    public void testSix() throws Exception {
        assertEquals(list(2,3), PrimeFactors.generatePrimes(6));
    }

    public void testEight() throws Exception {
        assertEquals(list(2,2,2), PrimeFactors.generatePrimes(8));
    }
    public void testNine() throws Exception {
        assertEquals(list(3,3), PrimeFactors.generatePrimes(9));
    }

    public void testHard() throws Exception {
        assertEquals(list(2,2,2,2,5,7,17,93241), PrimeFactors.generatePrimes(887654320));
    }

    public void testPrime() throws Exception {
        assertEquals(list(379721), PrimeFactors.generatePrimes(379721));
    }
}


