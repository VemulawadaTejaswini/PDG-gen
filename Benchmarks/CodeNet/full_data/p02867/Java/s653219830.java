import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Unit[] arrA = new Unit[n];
		TreeSet<Unit> treeA = new TreeSet<>();
		for (int i = 0; i < n; i++) {
		    arrA[i] = new Unit(i, sc.nextInt());
		    treeA.add(arrA[i]);
		}
		Unit[] arrB = new Unit[n];
		TreeSet<Unit> treeB = new TreeSet<>();
		for (int i = 0; i < n; i++) {
		    arrB[i] = new Unit(i, sc.nextInt());
		    treeB.add(arrB[i]);
		}
		int count = 0;
		while (treeA.size() > 0) {
		    Unit last = treeA.pollLast();
		    if (last.value <= arrB[last.id].value) {
		        treeB.remove(arrB[last.id]);
		    } else {
		        int tmp = last.id;
		        last.id = 0;
		        Unit next = treeB.ceiling(last);
		        if (next == null) {
		            System.out.println("No");
		            return;
		        }
		        Unit change = arrA[next.id];
		        treeA.remove(change);
		        change.id = tmp;
		        treeA.add(change);
		        arrA[change.id] = change;
		        treeB.remove(next);
		        count++;
		    }
		}
		if (count > n - 2) {
		    System.out.println("No");
		} else {
	    	System.out.println("Yes");
		}
	}
	
	static class Unit implements Comparable<Unit>{
	    int id;
	    int value;
	    
	    public Unit(int id, int value) {
	        this.id = id;
	        this.value = value;
	    }
	    
	    public int hashCode() {
	        return id;
	    }
	    
	    public boolean equals(Object o) {
	        Unit u = (Unit)o;
	        return id == u.id && value == u.value;
	    }
	    
	    public int compareTo(Unit another) {
	        if (value == another.value) {
	            return id - another.id;
	        } else {
	            return value - another.value;
	        }
	    }
	    
	    public String toString() {
	        return "id:" + id + " value:" + value;
	    }
	}
}
