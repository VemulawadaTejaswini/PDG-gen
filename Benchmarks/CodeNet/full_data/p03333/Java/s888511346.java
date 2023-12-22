import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Interval> smallSet1 = new TreeSet<Interval>(new Comparator<Interval>() {
		    public int compare(Interval i1, Interval i2) {
		        if (i1.right == i2.right) {
		            return i1.idx - i2.idx;
		        } else {
		            return i1.right - i2.right;
		        }
		    }
		});
		for (int i = 0; i < n; i++) {
		    smallSet1.add(new Interval(i, sc.nextInt(), sc.nextInt()));
		}
		TreeSet<Interval> largeSet1 = new TreeSet<Interval>(new Comparator<Interval>() {
		    public int compare(Interval i1, Interval i2) {
		        if (i1.left == i2.left) {
		            return i1.idx - i2.idx;
		        } else {
		            return i1.left - i2.left;
		        }
		    }
		});
		largeSet1.addAll(smallSet1);
		TreeSet<Interval> smallSet2 = (TreeSet<Interval>)smallSet1.clone();
		TreeSet<Interval> largeSet2 = (TreeSet<Interval>)largeSet1.clone();
		boolean isSmall = true;
		long total1 = 0;
		int current = 0;
		while (smallSet1.size() > 0) {
		    Interval target;
		    if (isSmall) {
		        target = smallSet1.pollFirst();
		        largeSet1.remove(target);
		    } else {
		        target = largeSet1.pollLast();
		        smallSet1.remove(target);
		    }
	        if (target.right < current) {
	            total1 += current - target.right;
	            current = target.right;
	        } else if (target.left > current) {
	            total1 += target.left - current;
	            current = target.left;
	        }
	        isSmall = !isSmall;
		}
		total1 += Math.abs(current);
		isSmall = false;
		long total2 = 0;
		current = 0;
		while (smallSet2.size() > 0) {
		    Interval target;
		    if (isSmall) {
		        target = smallSet2.pollFirst();
		        largeSet2.remove(target);
		    } else {
		        target = largeSet2.pollLast();
		        smallSet2.remove(target);
		    }
	        if (target.right < current) {
	            total2 += current - target.right;
	            current = target.right;
	        } else if (target.left > current) {
	            total2 += target.left - current;
	            current = target.left;
	        }
	        isSmall = !isSmall;
		}
		total2 += Math.abs(current);
	    System.out.println(Math.max(total1, total2));
	}
	
    static class Interval {
        int idx;
        int left;
        int right;
        
        public Interval(int idx, int left, int right) {
            this.idx = idx;
            this.left = left;
            this.right = right;
        }
        
        public int hashCode() {
            return idx;
        }
        
        public boolean equals(Object o) {
            Interval another = (Interval)o;
            return this.idx == another.idx;
        }
    }
}
	
