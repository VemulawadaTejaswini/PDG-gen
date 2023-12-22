import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer,List<int[]>> map = new HashMap<>();
		for(int i=0;i<n-1;i++) {
			int[] tmp = new int[3];
			tmp[0] = in.nextInt();
			tmp[1] = in.nextInt();
			tmp[2] = in.nextInt();
			int[] tmp2 = new int[3];
			tmp2[0] = tmp[1];
			tmp2[1] = tmp[0];
			tmp2[2] = tmp[2];
			if(map.containsKey(tmp[0])) {
				map.get(tmp[0]).add(tmp);
			}else {
				List<int[]> list = new ArrayList<>();
				list.add(tmp);
				map.put(tmp[0], list);
			}
			if(map.containsKey(tmp2[0])) {
				map.get(tmp2[0]).add(tmp2);
			}else {
				List<int[]> list = new ArrayList<>();
				list.add(tmp2);
				map.put(tmp2[0], list);
			}
		}
		int[] ans = new int[n+1];
		for(int i=1;i<=n;i++) {
			ans[i] = -1;
		}
		ans[1] = 0;
		Queue<Integer> que = new ArrayDeque<>();
		que.add(1);
		while(!que.isEmpty()) {
			int tmp = que.poll();
			List<int[]> list = map.get(tmp);
			for(int[] edge : list) {
				if(ans[edge[1]]!=-1) continue;
				que.add(edge[1]);
				if(edge[2]%2==0) ans[edge[1]] = ans[edge[0]];
				else ans[edge[1]] = ans[edge[0]]==0?1:0;
			}
		}
		for(int i=1;i<=n;i++) {
			System.out.println(ans[i]);
		}
		in.close();
	}

}
