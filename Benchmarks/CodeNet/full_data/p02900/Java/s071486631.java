import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskT solver = new TaskT();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskT {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long A = in.nextLong();
            long B = in.nextLong();
            // if we find the greatest common divisor of both A and B we have the number upto which we need to consider 
            //and then for coprimes we find all number from 1 to GCD which are primes 
            // if the prime number divides both A and B then we can increment our counter 
            
            long result = 1;
            long gcd = GCD1(A, B);
            for (long i = 2; i * i <= gcd; ++i) {
            	if (gcd % i == 0)  result++;
            	while (gcd % i == 0) gcd /= i;
            }
            result += (gcd > 1 ? 1 : 0);
            
            /*
            boolean[] primes = prime_sieve(gcd);  // find all primes till GCD
            int result = 0;
            for(int i = 1; i < primes.length; i++){
            	if(primes[i]){  // if a number is prime and is a divisor of A and B then it suits our output criteria
            		if(A%i == 0 && B%i == 0)
            			result ++;
            	}
            }*/
            out.print(result);
        }
        
        public long GCD(long a, long b){
        	long dividend = Math.max(a, b);
        	long divisor = Math.min(a, b);
        	long remainder = dividend % divisor;      	
        	while(remainder != 0){
        		remainder = dividend % divisor;
        		dividend = divisor;
        		divisor = remainder;
        	}
        	return dividend;
        }
        
        public long GCD1(long a, long b) {
        	if (b == 0) return a;
        	return GCD1(b, a % b);
        }
        
        public boolean[] prime_sieve(long n){
        	boolean[] isPrime = new boolean[(int) (n+1)];
        	Arrays.fill(isPrime, true);
        	for(int i = 2 ; i < Math.sqrt(n); i++){
        		for(int j = 2*i; j <= n; j = j+i ){
        			isPrime[j] = false;
        		}
        	}
        	
        	return isPrime;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
