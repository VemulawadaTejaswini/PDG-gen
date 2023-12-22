import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Unit> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
		    set.add(new Unit(i, sc.nextInt()));
		}
		long[] ans = new long[n];
		while (set.size() > 1) {
		    Unit current = set.pollFirst();
		    Unit next = set.first();
		    if (current.value == next.value) {
		        set.pollFirst();
		        current.up(next.times);
		        set.add(current);
		    } else {
		        ans[current.idx] += current.remove(next.value);
		        set.add(current);
		    }
		}
		Unit last = set.pollFirst();
		ans[last.idx] += last.remove(0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    sb.append(ans[i]).append("\n");
		}
	    System.out.print(sb);
    }
    
    static class Unit implements Comparable<Unit> {
        int idx;
        int value;
        long times;
        
        public Unit(int idx, int value) {
            this.idx = idx;
            this.value = value;
            this.times = 1;
        }
        
        public void up(long x) {
            times += x;
        }
        
        public int compareTo(Unit another) {
            if (value == another.value) {
                return idx - another.idx;
            } else {
                return another.value - value;
            }
        }
        
        public int hashCode() {
            return idx;
        }
        
        public boolean equals(Object o) {
            return compareTo((Unit) o) == 0;
        }
        
        public long remove(int x) {
            long ans = (value - x) * times;
            value = x;
            return ans;
        }
        
        public String toString() {
            return idx + ":" + value;
        }
    }
}

