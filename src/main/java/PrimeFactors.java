import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemo on 2014-10-18.
 */
public class PrimeFactors {

    public static List<Integer> generatePrimes(int n){

        List<Integer> primes = new ArrayList<Integer>();

    for (int candidate = 2; n > 1; candidate++ ){
        for (; n%candidate==0; n /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }
}
