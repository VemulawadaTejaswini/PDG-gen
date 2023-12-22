import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] c = new char[H][W];
		int n = H * W;
		int[] d  = new int[n];
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) {
				c[i][j] = s.charAt(j);
				int idx = i * W + j;
				if(c[i][j] == '#') {
					d[idx] = 0;
				}else {
					d[idx] = 1;
				}
			}
		}
		sc.close();
		DisjointSet ds = new DisjointSet(n);
		// 右、左、下、上
		int[] dn = {1, -1, W, -W};
		int[] replace = {1, 0, 3, 2};;
		boolean[][] flag = new boolean[n][4];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 4; j++) {
				flag[i][j] = true;
			}
		}
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 4; j++) {
//				int ni = i + dn[j];
//				if(ni >= 0 && ni < n) {
//					if(d[i] == d[ni]) continue;
//					if(!flag[i][j]) continue;
//					ds.unite(i, ni);
//					flag[i][j] = false;
//					flag[ni][replace[j]] = false;
//				}
//			}
//		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(i + 1 < H && c[i][j] != c[i + 1][j]) {
					ds.unite(W * i + j, W * (i + 1) + j);
				}
				if(j + 1 < W && c[i][j] != c[i][j + 1]) {
					ds.unite(W * i + j, W * i + j + 1);
				}
			}
		}
		long ans = 0;
		long[] b = new long[n];
		long[] w = new long[n];
		for(int i = 0; i < n; i++) {
			if(d[i] == 0) {
				b[ds.findSet(i)]++;
			}else {
				w[ds.findSet(i)]++;
			}
		}
		for(int i = 0; i < n; i++) {
			ans += b[i] * w[i];
		}
		System.out.println(ans);
	}
	static class DisjointSet {
        int[] p;
        int[] rank;
        int[] size;
        DisjointSet(){}
        DisjointSet(int size){
            this.rank = new int[size];
            this.p = new int[size];
            this.size = new int[size];
            for(int i = 0; i < size; i++) {
                makeSet(i);
            }
        }
        void makeSet(int x) {
            p[x] = x;
            rank[x] = 0;
            size[x] = 1;
        }
        boolean same(int x, int y) {
            return findSet(x) == findSet(y);
        }
        void unite(int x, int y) {
            link(findSet(x), findSet(y));
        }
        void link(int x, int y) {
            if(rank[x]  > rank[y]) {
                p[y] = x;
                size[x] = size[x] + size[y];
            }else if(rank[x] < rank[y]){
                p[x] = y;
                size[y] = size[x] + size[y];
            }else if(x != y) {
            	p[y] = x;
            	rank[x]++;
            	size[x] = size[x] + size[y];
            }
        }
        int findSet(int x) {
            if(x != p[x]) {
                p[x] = findSet(p[x]);
            }
            return p[x];
        }
        int size(int x) {
        	if(x != p[x]) {
        		size[x] = size(findSet(x));
        	}
        	return size[x];
        }
    }
}
