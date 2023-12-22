import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = 0; i < m; i++) {
		    int left = sc.nextInt() - 1;
		    int right = sc.nextInt() - 1;
		    int dist = sc.nextInt();
		    if (uft.same(left, right)) {
		        if (uft.getDist(left, right) != dist) {
		            System.out.println("No");
		            return;
		        }
		    } else {
		        uft.unite(left, right, dist);
		    }
		}
		System.out.println("Yes");
    }
    
    static class UnionFindTree {
        int[] parents;
        int[] dists;
        
        public UnionFindTree(int size) {
            parents = new int[size];
            dists = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
            }
        }
        
        public int find(int x) {
            if (parents[x] == x) {
                return x;
            }
            int ret = find(parents[x]);
            dists[x] += dists[parents[x]];
            parents[x] = ret;
            return ret;
        }
        
        public boolean same(int x, int y) {
            return find(x) == find(y);
        }
        
        public void unite(int left, int right, int dist) {
            int xx = find(left);
            int yy = find(right);
            if (xx == yy) {
                return;
            }
            int leftDist = dists[left];
            int rightDist = dists[right];
            parents[yy] = xx;
            dists[yy] = leftDist - rightDist + dist;
            find(right);
        }
        
        public int getDist(int left, int right) {
            find(left);
            find(right);
            return dists[right] - dists[left];
        }
    }
}

