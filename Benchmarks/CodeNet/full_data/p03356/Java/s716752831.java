
import static java.lang.System.*;
import java.util.*;

public class Main {
	static int[] par;
	static int[] rank;
	
	public static void UnionFindTree(int size) {
		par = new int[size];
		rank = new int[size];
		for (int i = 0; i < size; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}
	
	public static void union(int x, int y) {
		int xroot = find(x);
		int yroot = find(y);
		
		if (rank[xroot] > rank[yroot]) par[yroot] = xroot;
		else if(rank[xroot] < rank[yroot]) par[xroot] = yroot;
		else if (xroot != yroot){
			par[yroot] = xroot;
			rank[xroot]++;
		}
	}
	
	public static int find(int i) {
		//out.println(i + " " + par[i]);
		if (i != par[i]) par[i] = find(par[i]);
		return par[i];
	}
	
	public static boolean same(int x, int y) {
		//out.println(" " + x + " " + y);
		return find(x) == find(y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] num = new int[n];
		for(int i=0; i<n; i++) num[i] = sc.nextInt();
		
		int[] x = new int[m];
		int[] y = new int[m];
		for(int i=0; i<m; i++) {
			x[i] = sc.nextInt()-1;
			y[i] = sc.nextInt()-1;
		}
		
		UnionFindTree(n);
		for(int i=0; i<m; i++) union(x[i], y[i]);
		
		//for(int i=0; i<n; i++) out.println(par[i]);
		
		int count=0;
		for(int i=0; i<n; i++) {
			if(same(i, num[i]-1)) count++;
		}
		
		out.println(count);
	}

}
