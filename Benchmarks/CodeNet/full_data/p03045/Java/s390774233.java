
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int N=gi();
        int M=gi();
        UnionFind uf=new UnionFind(N);

        for (int i=0;i<M;i++) {
        	int x=gi()-1;
        	int y=gi()-1;
        	int z=gi();
        	uf.union(x, y);
        }

        Set<Integer> l=new HashSet<Integer>();
        for (int i=0;i<N;i++) {
        	int r=uf.find(i);
        	l.add(r);
        }

        System.out.println(l.size());
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
            return -find(n);
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