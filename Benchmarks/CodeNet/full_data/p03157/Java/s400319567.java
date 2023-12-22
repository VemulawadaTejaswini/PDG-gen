
import java.util.AbstractMap;
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int H=gi();
        int W=gi();
        char[][] g=new char[H][W];
        boolean[][] f=new boolean[H][W];
        UnionFind uf=new UnionFind(H*W);

        for (int i=0; i<H;i++) {
            String s=gs();
        	for (int j=0; j<W;j++) {
                char c=s.charAt(j);
                g[i][j]=c;
            }
        }

        long ans=0;
        for (int i=0; i<H;i++) {
        	for (int j=0; j<W;j++) {
        		char c=g[i][j];
                if (i-1>=0 && f[i-1][j]==false && c!=g[i-1][j]) {
                	uf.union(i*W+j, (i-1)*W+j);
                }
                if (j-1>=0 && f[i][j-1]==false && c!=g[i][j-1]) {
                	uf.union(i*W+j, i*W+j-1);
                }
                if (i+1<H && f[i+1][j]==false && c!=g[i+1][j]) {
                	uf.union(i*W+j, (i+1)*W+j);
                }
                if (j+1<W && f[i][j+1]==false && c!=g[i][j+1]) {
                	uf.union(i*W+j, i*W+j+1);
                }
            }
        }

        long[] sharp=new long[H*W];
        long[] dot=new long[H*W];
        for (int i=0; i<H;i++) {
        	for (int j=0; j<W;j++) {
        		char c=g[i][j];
        		int root=uf.find(i*W+j);
        		if(c=='#') {
        			sharp[root]++;
        		} else {
        			dot[root]++;
        		}
            }
        }

        for (int i=0; i<H*W;i++) {
            ans+=sharp[i]*dot[i];
        }

        System.out.println(ans);
    }

    public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
        /** serialVersionUID. */
        private static final long serialVersionUID = 6411527075103472113L;

        public Pair(final K key, final V value) {
            super(key, value);
        }

        @Override
        public int compareTo(Pair<K, V> o) {

            Comparable key = (Comparable)this.getKey();
            Comparable key2 = (Comparable)o.getKey();

            return key.compareTo(key2);
        }

    }

    public static class UnionFind {

    	int[] parent;
    	public UnionFind(int n) {
    		parent=new int[n];
    		for(int i=0; i<parent.length;i++) {
    			parent[i]=-1;
    		}
    	}

    	public int find(int n) {
    		if(parent[n]<0) {
    			return n;
    		} else {
    			parent[n]=find(parent[n]);
    			return parent[n];
    		}

    	}

    	public void union(int n1, int n2) {
    		int r1=find(n1);
    		int r2=find(n2);
    		if(r1==r2) return;

    		if(getRunk(r1)<getRunk(r2)) {
    			parent[n1]=r2;
    		} else {
    			parent[n2]=r1;
    			if(getRunk(r1)==getRunk(r2)) parent[r1]--;
    		}
    	}

    	public int getRunk(int n) {
            return -parent[find(n)];
    	}

    	public int getKindNum() {
            int ret=0;
            for (int i=0; i<parent.length;i++) {
            	if(parent[i]<0) {
            		ret++;
            	}
            }
            return ret;
    	}

    	public boolean same(int n1, int n2) {
    		return find(n1)==find(n2);
    	}
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}