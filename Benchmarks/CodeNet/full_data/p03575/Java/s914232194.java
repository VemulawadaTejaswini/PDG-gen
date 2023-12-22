import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] map = new int[M][2];
		for (int i = 0; i < M; i++) {
			int[] tmp = new int[2];
			tmp[0] = sc.nextInt();
			tmp[1] = sc.nextInt();
			map[i] = tmp; 
		}
		
		int ans = 0;
		boolean next;
		do {
			next = false;
			for (int i = 1; i <= N; i++) {
				
				int count = 0;
				int[] tmp = new int[2];
				
				for (int j = 0; j < M; j++) {
					if (map[j][0] == i || map[j][1] == i) {
						tmp = map[j];
						count++;
					} 
				}
				
				if (count == 1) {
					tmp[0] = -1;
					tmp[1] = -1;
					ans++;
					next = true;
				}
			}
			
		} while (next);
		
		System.out.println(ans);
	}
}