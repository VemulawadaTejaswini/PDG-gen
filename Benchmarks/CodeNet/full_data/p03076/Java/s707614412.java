import java.util.*;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] order = new int[5];
		order[0] = sc.nextInt();
		order[1] = sc.nextInt();
		order[2] = sc.nextInt();
		order[3] = sc.nextInt();
		order[4] = sc.nextInt();
		sc.close();
		int[] time = new int[5];
		for(int i = 0; i < 5; i++) {
			time[i] = (order[i] / 10) * 10 + (order[i] % 10 != 0 ? 10 : 0);
		}
		int max = 0;
		int ans = 0;
		for(int i = 0; i < 5; i++) {
			max = Math.abs(time[i] - order[i]) > max ? Math.abs(time[i] - order[i]) : max;
			ans += time[i];
		}
		System.out.println(ans - max);
	}
}
