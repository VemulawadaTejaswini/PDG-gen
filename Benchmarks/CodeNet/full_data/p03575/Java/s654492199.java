import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arrA = new int[m];
		int[] arrB = new int[m];
		for (int i = 0; i < m; i++) {
		    arrA[i] = sc.nextInt() - 1;
		    arrB[i] = sc.nextInt() - 1;
		}
		int count = 0;
		for (int i = 0; i < m; i++) {
		    UnionFindTree uft = new UnionFindTree(n);
		    for (int j = 0; j < m; j++) {
		        if (i == j) {
		            continue;
		        }
		        uft.unite(arrA[j], arrB[j]);
		    }
		    if (!uft.isUnion()) {
		        count++;
		    }
		}
        System.out.println(count);
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
	    
	    public void unite(int x, int y) {
	        int xx = find(x);
	        int yy = find(y);
	        if (xx == yy) {
	            return;
	        }
	        parents[xx] = yy;
	    }
	    
	    public boolean isUnion() {
	        int count = 0;
	        for (int i = 0; i < parents.length; i++) {
	            if (i == parents[i]) {
	                count++;
	            }
	        }
	        return count == 1;
	    }
	}
}
