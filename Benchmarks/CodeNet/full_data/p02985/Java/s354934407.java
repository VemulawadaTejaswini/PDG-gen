import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		if(n==1) System.out.println(k);
		else {
			Map<Integer,List<Integer>> map = new HashMap<>();
			for(int i=0;i<n-1;i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				if(map.containsKey(a)) map.get(a).add(b);
				else {
					List<Integer> list = new ArrayList<>();
					list.add(b);
					map.put(a, list);
				}
				if(map.containsKey(b)) map.get(b).add(a);
				else {
					List<Integer> list = new ArrayList<>();
					list.add(a);
					map.put(b, list);
				}
			}
			
			long ans = k;
			long mod = 1000000007;
			Deque<Integer> que = new ArrayDeque<>();
			
			boolean[] used = new boolean[n+1];
			
			List<Integer> list = map.get(1);
			for(int i=0;i<list.size();i++) {
				que.add(list.get(i));
				ans = (ans * (k-1-i))%mod;
			}
			used[1] = true;
			
			while(!que.isEmpty()) {
				int tmp = que.poll();
				if(!used[tmp]) {
					list = map.get(tmp);
					for(int i=0;i<list.size();i++) {
						que.add(list.get(i));
					}
					for(int i=0;i<list.size()-1;i++) {
						ans = (ans * (k-2-i))%mod;
					}
					used[tmp] = true;
				}
			}
			System.out.println(ans);
		}
		in.close();

	}

}
