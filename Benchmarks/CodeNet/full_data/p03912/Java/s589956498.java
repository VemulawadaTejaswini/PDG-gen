import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Mod[] mods = new Mod[m];
		for (int i = 0; i < m; i++) {
		    mods[i] = new Mod();
		}
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    mods[x % m].add(x);
		}
		int count = 0;
		for (int i = 1; i <= (m - 1) / 2; i++) {
		    int min = Math.min(mods[i].count, mods[m - i].count);
		    count += min;
		    mods[i].count -= min;
		    mods[m - i].count -= min;
		}
		if (m % 2 == 0) {
		    int min = mods[m / 2].count / 2;
		    count += min;
		    mods[m / 2].count -= min * 2;
		}
	    int min = mods[0].count / 2;
	    count += min;
	    mods[0].count -= min * 2;
		for (int i = 0; i < m; i++) {
		    count += mods[i].getPair();
		}
		System.out.println(count);
	}
	
	static class Mod {
	    int count;
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    public void add(int x) {
	        count++;
	        if (map.containsKey(x)) {
	            map.put(x, map.get(x) + 1);
	        } else {
	            map.put(x, 1);
	        }
	    }
	    
	    public int getPair() {
	        int pair = 0;
	        for (int x : map.values()) {
	            if (x + pair * 2 > count) {
	                pair += (count - pair * 2) / 2;
	                break;
	            } else {
	                pair += x / 2;
	            }
	        }
	        return pair;
	    }
	}
}
	
