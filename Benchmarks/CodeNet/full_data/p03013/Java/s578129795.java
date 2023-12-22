
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int N;
	public static int[] stair;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> broken = new ArrayList<>();
		for(int i = 1; i < M + 1; i++) {
			broken.add(sc.nextInt());
		}
		stair = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			stair[i] = 0;
		}
		for(Integer e : broken) {
			stair[e] = 1;
		}
		System.out.println(stair.toString());
		long ans = Main.Stair(0);
		System.out.println(ans % 1000000007);
	}

	private static long Stair(int n) {
		System.out.println("aaaa");
		long count = 0;
		if(n >= N - 1) {
			count = 1;
		} else if(n < N - 1) {
			if(stair[n + 1] == 0) {
				count += Main.Stair(n + 1);
			}
			if(stair[n + 2] == 0) {
				count += Main.Stair(n + 2);
			}
		}
		System.out.println(count);
		return count;
	}

}
