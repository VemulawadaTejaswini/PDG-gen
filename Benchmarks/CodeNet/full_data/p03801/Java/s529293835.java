import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, Unit> map = new TreeMap<>();
		int max = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        map.put(x, new Unit(i, x));
		    } else {
		        map.lastEntry().getValue().add(x);
		    }
		}
		long[] counts = new long[n];
		Unit prev = map.pollLastEntry().getValue();
		while (map.size() > 0) {
		    Unit now = map.pollLastEntry().getValue();
		    counts[prev.idx] = prev.calcCount(now.value);
		    for (Map.Entry<Integer, Integer> entry : prev.map.entrySet()) {
		        if (now.map.containsKey(entry.getKey())) {
		            now.map.put(entry.getKey(), now.map.get(entry.getKey()) + entry.getValue());
		        } else {
		            now.map.put(entry.getKey(), entry.getValue());
		        }
		    }
		    prev = now;
		}
		counts[prev.idx] = prev.calcCount(0);
		StringBuilder sb = new StringBuilder();
		for (long x : counts) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Unit {
	    int idx;
	    int value;
	    TreeMap<Integer, Integer> map = new TreeMap<>();
	    long count = 0;
	    
	    public Unit (int idx, int value) {
	        this.idx = idx;
	        this.value = value;
	        map.put(value, 1);
	    }
	    
	    public void add(int x) {
	        if (map.containsKey(x)) {
	            map.put(x, map.get(x) + 1);
	        } else {
	            map.put(x, 1);
	        }
	    }
	    
	    public long calcCount(int ceil) {
	        while (map.size() > 0) {
	            Map.Entry<Integer, Integer> entry = map.pollLastEntry();
	            int x = entry.getKey();
	            int v = entry.getValue();
	            if (x <= ceil) {
	                map.put(x, v);
	                break;
	            }
	            long size = x - ceil;
	            count += size * v;
	            if (map.containsKey(ceil)) {
	                map.put(ceil, map.get(ceil) + v);
	            } else {
	                map.put(ceil, v);
	            }
	        }
	        return count;
	    }
	}
}
