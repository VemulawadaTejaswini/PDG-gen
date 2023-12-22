import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] deepMap = new int[N];
		int[][] map = new int[M][2];
		for (int i = 0; i < M; i++) {
			int[] tmp = new int[2];
			tmp[0] = sc.nextInt() - 1;
			tmp[1] = sc.nextInt() - 1;
			map[i] = tmp;
			for (int j = tmp[0]; j < tmp[1]; j++) {
				deepMap[j]++;
			}
		}
		
		boolean[] hashi = new boolean[N-1];
		int ans = 0;
		for (int i = 0; i < M; i++) {
			int[] tmp = map[i];
			int maxIndex = -1;
			int max = 0;
			for (int j = tmp[0]; j < tmp[1]; j++) {
				if (hashi[j]) {
					maxIndex = -1;
					break;
				}
				
				int tmpMax = max;
				max = Math.max(max, deepMap[j]);
				if (tmpMax != max) {
					maxIndex = j - 1;
				}
			}
			
			if (maxIndex != -1) {
				ans++;
				hashi[maxIndex] = true;
			}
			
		}
		
		System.out.println(ans);
	}
	
}