import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;
    static TreeSet<Integer> primes = new TreeSet<>();
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 2; i <= Math.sqrt(1000000); i++) {
		    if (isPrime(i)) {
		        primes.add(i);
		    }
		}
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ", n);
		ArrayList<HashMap<Integer, Integer>> maps = new ArrayList<>();
		HashMap<Integer, Integer> all = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    maps.add(getMap(Integer.parseInt(line[i])));
		    for (Map.Entry<Integer, Integer> entry : maps.get(i).entrySet()) {
		        if (!all.containsKey(entry.getKey()) || all.get(entry.getKey()) < entry.getValue()) {
		            all.put(entry.getKey(), entry.getValue());
		        }
		    }
		}
		long[] ans = new long[n];
		Arrays.fill(ans, 1L);
		for (Map.Entry<Integer, Integer> entry : all.entrySet()) {
		    for (int i = 0; i < maps.size(); i++) {
		        if (maps.get(i).containsKey(entry.getKey())) {
		            ans[i] *= pow(entry.getKey(), entry.getValue() - maps.get(i).get(entry.getKey()));
		        } else {
		            ans[i] *= pow(entry.getKey(), entry.getValue());
		        }
		        ans[i] %= MOD;
		    }
		}
		long total = 0;
		for (long x : ans) {
		    total += x;
		    total %= MOD;
		}
		System.out.println(total);
	}
	
	static boolean isPrime(int x) {
	    for (int y : primes) {
	        if (Math.sqrt(x) < y) {
	            break;
	        }
	        if (x % y == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	static HashMap<Integer, Integer> getMap(int x) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for (int y : primes) {
	        if (Math.sqrt(x) < y) {
	            break;
	        }
	        while (x % y == 0) {
	            if (map.containsKey(y)) {
	                map.put(y, map.get(y) + 1);
	            } else {
	                map.put(y, 1);
	            }
	            x /= y;
	        }
	    }
	    if (x > 1) {
	        if (map.containsKey(x)) {
	            map.put(x, map.get(x) + 1);
	        } else {
	            map.put(x, 1);
	        }
	    }
	    return map;
	}
	
	static long pow(long x, long p) {
	    if (p == 0) {
	        return 1;
	    } else if (p % 2 == 0) {
	        return pow(x * x % MOD, p / 2);
	    } else {
	        return pow(x, p - 1) * x % MOD;
	    }
	}
}
