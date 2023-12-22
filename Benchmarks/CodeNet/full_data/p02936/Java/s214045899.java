import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		int a,b;
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0; i<n-1; i++) {
		    a = Integer.parseInt(sc.next());
		    b = Integer.parseInt(sc.next());
		    if(map.containsKey(a)) { map.get(a).add(b);}
		    else {
		        map.put(a, new ArrayList<Integer>()); 
		        map.get(a).add(b);
		    }
		    if(map.containsKey(b)) { map.get(b).add(a);}
		    else {
		        map.put(b, new ArrayList<Integer>()); 
		        map.get(b).add(a);
		    }
		}
		

		long[] count = new long[n];
		for(int i=0; i<q; i++) {
		    int p = Integer.parseInt(sc.next())-1;
		    int x = Integer.parseInt(sc.next());
		    count[p] += x;
		}
		
		boolean[] visited = new boolean[n];
		Deque<Integer> que = new ArrayDeque<>();
		que.add(1);
		visited[0] = true;
		while(que.size() != 0) {
		    int z = que.poll();
		    if(map.get(z) != null) {
    		    for(int x : map.get(z)) {
    		        if(visited[x-1] == false) {
        		        que.add(x);
        		        count[x-1] += count[z-1];
        		        visited[x-1] = true;
    		        }
    		    }
		    }
		}
		
		for(long ans : count) {
		    System.out.print(ans+" ");
		}
		System.out.println();
	}
	
	
}