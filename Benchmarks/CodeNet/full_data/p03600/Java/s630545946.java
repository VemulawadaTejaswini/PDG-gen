import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Distance>[] graph;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Distance> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    String[] line = br.readLine().split(" ", n);
		    for (int j = 0; j < n; j++) {
		        int x = Integer.parseInt(line[j]);
		        if (i < j) {
		            list.add(new Distance(i, j, x));
		        }
		    }
		}
		Collections.sort(list);
		graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
		    graph[i] = new ArrayList<Distance>();
		}
		long total = 0;
		long[] costs = new long[n];
		for (Distance d : list) {
		    Arrays.fill(costs, Long.MAX_VALUE);
		    search(d.from, costs, 0);
		    if (costs[d.to] > d.cost) {
		        total += d.cost;
		        graph[d.from].add(d);
		        graph[d.to].add(d);
		    } else if (costs[d.to] < d.cost) {
		        System.out.println(-1);
		        return;
		    }
		}
        System.out.println(total);
   }
   
   static class Distance implements Comparable<Distance> {
       int from;
       int to;
       int cost;
       
       public Distance(int from, int to, int cost) {
           this.from = from;
           this.to = to;
           this.cost = cost;
       }
       
       public int compareTo(Distance another) {
           return cost - another.cost;
       }
   }
   
   static void search(int idx, long[] costs, long total) {
       if (costs[idx] <= total) {
           return;
       }
       costs[idx] = total;
       for (Distance next : graph[idx]) {
           int nextIdx;
           if (next.from == idx) {
               nextIdx = next.to;
           } else {
               nextIdx = next.from;
           }
           search(nextIdx, costs, total + next.cost);
       }
   }
}


