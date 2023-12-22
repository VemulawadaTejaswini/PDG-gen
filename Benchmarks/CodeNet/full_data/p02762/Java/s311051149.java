import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int k = sc.nextInt();
    	int[] except = new int[n];
    	prepare(n);

    	for (int i = 0; i < m; i++) {
    		int a = sc.nextInt()-1;
    		int b = sc.nextInt()-1;
    		union(a,b);
    		except[a]++;
    		except[b]++;
    	}
    	for (int i = 0; i < k; i++) {
    		int a = sc.nextInt()-1;
    		int b = sc.nextInt()-1;
    		if(find(a) == find(b)){
    		except[a]++;
    		except[b]++;
            }
    	}


    	for (int i = 0; i < n; i++) {
	    	System.out.print(desc[find(i)]-except[i] + " ");
	    }
    }
	private static int[] parent;
	private static int[] desc;

	private static void prepare(int n) {
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
		desc = new int[n];
	}

	private static void union(int a, int b) {
		int xroot = find(a);
		int yroot = find(b);
		if (xroot == yroot) return;
		if (desc[xroot] >- desc[yroot]) {
			parent[yroot] = xroot;
			desc[xroot] += desc[yroot]+1;
		} else {
			parent[xroot] = yroot;
			desc[yroot] += desc[xroot]+1;
		}
	}

	private static int find(int a) {
		if (parent[a] == a) {
			return a;
		} else {
			return find(parent[a]);
		}
	}
}

