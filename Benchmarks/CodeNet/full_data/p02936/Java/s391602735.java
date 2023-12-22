import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static long[] values;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		values = new long[n];
		for (int i = 0; i < q; i++) {
		    values[sc.nextInt() - 1] += sc.nextInt();
		}
		update(0, 0, 0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    sb.append(values[i]);
		}
		System.out.println(sb);
   }
   
   static void update(int idx, int from, long v) {
       values[idx] += v;
       for (int x : graph.get(idx)) {
           if (x == from) {
               continue;
           }
           update(x, idx, values[idx]);
       }
   }
}
