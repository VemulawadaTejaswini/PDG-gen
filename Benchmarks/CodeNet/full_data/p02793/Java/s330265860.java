import java.util.*;

public class Main {
	static int MOD = 1000000007;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();
        Map<Integer, Integer> factorMap = new HashMap<>();

        for(int num : arr) {
        	int factor = 2;
        	while(num > 1) {
            	int cnt = 0;
            	while(num % factor == 0) {
            		cnt++;
            		num /= factor;
            	}
            	factorMap.put(factor, Math.max(factorMap.getOrDefault(factor, 0), cnt));
            	factor++;
        	}
        }
        
        long f = 1;
        for(Map.Entry<Integer, Integer> entry : factorMap.entrySet()) {
        	f = f * powMod(entry.getKey(), entry.getValue()) % MOD;
        }
        
        long res = 0;
        for(int i = 0; i < n; i++) {
        	res += f * powMod(arr[i], MOD-2) % MOD;
        	res %= MOD;
        }
        System.out.println(res);
    }

    private static long powMod(long n, long p) {
    	if(p == 0)
    		return 1;
    	if(p == 1)
    		return n % MOD;
    	long res = powMod(n, p / 2) % MOD;
    	if(p % 2 == 0)
    		return res * res % MOD;
    	else
    		return (res * res)  % MOD * n % MOD;
    }
}
