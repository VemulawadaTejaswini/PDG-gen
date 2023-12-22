import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    
	    long n = Long.parseLong(in.readLine());
	    
	    long tmp = 1;
        long answer = n;

        while (n != 0)  {
            long cur = (n - 1) * tmp + (tmp - 1);

            if (digitsSum(cur) > digitsSum(answer) || (digitsSum(cur) == digitsSum(answer) && cur > answer)) {
            	answer = cur;
            }
            
            n /= 10;
            tmp *= 10;
        }

	    System.out.println(digitsSum(answer));
 
	}
	
	static long digitsSum(long n) {
		long sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}