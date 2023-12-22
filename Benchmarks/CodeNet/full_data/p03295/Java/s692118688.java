import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] map = new int[M][2];
		for (int m = 0; m < M; m++) {
			int[] tmp = new int[2];
			tmp[0] = sc.nextInt() - 1;
			tmp[1] = sc.nextInt() - 1;
			map[m] = tmp;
		}
		
		Arrays.sort(map, 0, map.length, (tmp1, tmp2) -> { return tmp1[1] - tmp2[1];} );
		
		int left = 0;
		int ans = 0;
		for (int i = 0; i < M; i++) {
			int[] tmp = map[i];
			if (left > tmp[0])
				continue;
			else {
				left = tmp[1];
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}