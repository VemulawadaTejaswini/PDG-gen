import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0; i<n-1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(map.get(a) == null){
				List<Integer> list = new ArrayList<>();
				list.add(b);
				map.put(a, list);
			} else {
				List<Integer> list = map.get(a);
				list.add(b);
				map.put(a, list);
			}
		}
		long[] ans = new long[n+1];
		for(int i=0; i<q; i++){
			int c = sc.nextInt();
			long d = sc.nextLong();
			ans[c] += d;
		}
		dfs(1, map, ans);
		for(int i=1; i<ans.length; i++){
			System.out.print(ans[i]+ " ");
		}
	}

	public static void dfs(int i, Map<Integer, List<Integer>> map, long[] ans){
		List<Integer> list = map.get(i);
		if(list == null) return;
		for(int j: list){
			ans[j] += ans[i];
			dfs(j, map, ans);
		}
	}
}
