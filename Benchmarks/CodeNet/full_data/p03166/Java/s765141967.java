import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		int side = sc.nextInt();
		int connect[][] = new int[side][2];
		for(int i = 0; i < side; i ++) {
			connect[i][0] = sc.nextInt();
			connect[i][1] = sc.nextInt();
		}
		long dist[] = new long[point];
		for(int i = 0; i < point; i ++) {
			dist[0] = 0;
		}
		for(int i = 0; i < side; i ++) {
			dist[connect[i][1] - 1] = Math.max(dist[connect[i][1] - 1], dist[connect[i][0] - 1] + 1);
		}

		long max = 0;
		for(int i = 0; i < point; i ++) {
			max = Math.max(max, dist[i]);
		}
		System.out.println(max);
	}
}