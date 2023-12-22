import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		UnionFindTree uft = new UnionFindTree(h, w);
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '#') {
		            uft.setBlack(i, j);
		        } else {
		            uft.setWhite(i, j);
		        }
		    }
		}
		
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '.') {
		            continue;
		        }
		        if (i != 0 && field[i - 1][j] == '.') {
		            uft.unite(i, j, i - 1, j);
		        }
		        if (i != h - 1 && field[i + 1][j] == '.') {
		            uft.unite(i, j, i + 1, j);
		        }
		        if (j != 0 && field[i][j - 1] == '.') {
		            uft.unite(i, j, i, j - 1);
		        }
		        if (j != w - 1 && field[i][j + 1] == '.') {
		            uft.unite(i, j, i, j + 1);
		        }
		        
		    }
		}
	    System.out.println(uft.getCount());
	}
	
	static class UnionFindTree {
	    int h;
	    int w;
	    int[] parents;
	    int[] blacks;
	    int[] whites;
	    
	    public UnionFindTree(int h, int w) {
	        this.h = h;
	        this.w = w;
	        int size = h * w;
	        parents = new int[size];
	        blacks = new int[size];
	        whites = new int[size];
	        for (int i = 0; i < size; i++) {
	            parents[i] = i;
	        }
	    }
	    
	    public int find (int x) {
	        if (parents[x] == x) {
	            return x;
	        } else {
	            return parents[x] = find(parents[x]);
	        }
	    }
	    
	    public void unite(int h1, int w1, int h2, int w2) {
	        unite(h1 * w + w1, h2 * w + w2);
	    }
	    
	    public void unite(int x, int y) {
	        int xx = find(x);
	        int yy = find(y);
	        if (xx == yy) {
	            return;
	        }
	        parents[xx] = yy;
	        blacks[yy] += blacks[xx];
	        whites[yy] += whites[xx];
	    }
	    
	    public void setBlack(int h1, int w1) {
	        blacks[h1 * w + w1]++;
	    }
	    
	    public void setWhite(int h1, int w1) {
	        whites[h1 * w + w1]++;
	    }
	    
	    public long getCount() {
	        long total = 0;
	        for (int i = 0; i < parents.length; i++) {
	            if (parents[i] == i) {
	                total += (long)blacks[i] * whites[i];
	            }
	        }
	        return total;
	    }
	}
}
	
