import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
		long ans = 0;
		for (HashMap<Integer, Integer> each : maps) {
		    ans += getLong(each, all);
		    ans %= MOD;
		}
		System.out.println(ans);
	}
	
	static HashMap<Integer, Integer> getMap(int x) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i = 2; i <= Math.sqrt(x); i++) {
	        while (x % i == 0) {
	            if (map.containsKey(i)) {
	                map.put(i, map.get(i) + 1);
	            } else {
	                map.put(i, 1);
	            }
	            x /= i;
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
	
	static long getLong(HashMap<Integer, Integer> each, HashMap<Integer, Integer> all) {
	    long ans = 1;
	    for (Map.Entry<Integer, Integer> entry : all.entrySet()) {
	        if (each.containsKey(entry.getKey())) {
	            ans *= pow(entry.getKey(), entry.getValue() - each.get(entry.getKey()));
	        } else {
	            ans *= pow(entry.getKey(), entry.getValue());
	        }
	        ans %= MOD;
	    }
	    return ans;
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
