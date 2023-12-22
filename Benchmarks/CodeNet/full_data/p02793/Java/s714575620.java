import java.io.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int[] nums = new int[N];
		int[] primes = new int[1000001];
		for (int i = 0; i < N; i++) {
			nums[i] = sc.ni();
			int num = nums[i];
			for (int p = 2; p*p <= nums[i]; p++) {
				int pow = 0;
				while (num % p == 0) {
					num /= p;
					pow++;
				}
				primes[p] = Math.max(primes[p],pow);
			}
			if (num > 1 && primes[num] == 0) {
				primes[num] = 1;
			}
		}
		
		int[][] smallPowers = new int[1001][21];
		for (int i = 2; i <= 1000; i++) {
			smallPowers[i][0] = 1;
			int j = 1;
			while (smallPowers[i][j-1]*i <= 1000000) {
				smallPowers[i][j] = smallPowers[i][j-1]*i;
				j++;
			}
		}
		HashSet<Integer> lcm = new HashSet<Integer>();
		for (int i = 2; i <= 1000000; i++) {
			if (primes[i] > 0) {
				lcm.add(i);
			}
		}
		long ans = 0;
		for (int i = 0; i < N; i++) {
			int num = nums[i];
			long B = 1;
			for (int prime: lcm) {
				int powI = 0;
				while (num % prime == 0) {
					num /= prime;
					powI++;
				}
				int pow = primes[prime]-powI;
				if (prime <= 1000) {
					B *= smallPowers[prime][pow];
				} else if (pow == 1){
					B *= prime;
				}
				B %= MOD;
			}
			ans += B;
			ans %= MOD;
		}
		pw.println(ans);
		pw.close();
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
		if (a < b) return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int ni() { 
            return Integer.parseInt(next()); 
        } 
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}