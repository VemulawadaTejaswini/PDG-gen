import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = 0; i < m; i++) {
		    uft.unite(sc.nextInt() - 1, sc.nextInt() - 1);
		    sc.nextInt();
		}
		System.out.print(uft.getCount());
	}
	
	static class UnionFindTree {
	    int[] parents;
	    
	    public UnionFindTree(int size) {
	        parents = new int[size];
	        for (int i = 0; i < size; i++) {
	            parents[i] = i;
	        }
	    }
	    
	    public int find(int x) {
	        if (parents[x] == x) {
	            return x;
	        } else {
	            return parents[x] = find(parents[x]);
	        }
	    }
	    
	    public void unite (int x, int y) {
	        int xx = find(x);
	        int yy = find(y);
	        if (xx == yy) {
	            return;
	        }
	        parents[xx] = yy;
        }

	    public int getCount() {
	        int count = 0;
	        for (int i = 0; i < parents.length; i++) {
	            if (parents[i] == i) {
	                count++;
	            }
	        }
	        return count;
	        
	    }
	}
}
