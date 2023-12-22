import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    static int k;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		k = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		long ans = kaijo(k, graph.get(0).size() + 1);
		for (int x : graph.get(0)) {
		    ans *= getCount(x, 0);
		    ans %= MOD;
		}
		System.out.println(ans);
   }
   
   static long kaijo(long num, int count) {
       long ans = 1;
       for (int i = 0; i < count; i++) {
           ans *= num - i;
           ans %= MOD;
       }
       return ans;
   }
   
   static long getCount(int idx, int parent) {
       long ans = kaijo(k - 2, graph.get(idx).size() - 1);
       for (int x : graph.get(idx)) {
           if (x == parent) {
               continue;
           }
           ans *= getCount(x, idx);
           ans %= MOD;
       }
       return ans;
   }

}
