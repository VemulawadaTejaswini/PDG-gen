import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] pos = new int[N+2];
		long ans = 0;
		for(int i = 1;i < N+1;i++) {
			pos[i] = scn.nextInt();
		}
		for(int i = 1;i < N+2;i++) {
			ans += Math.abs(pos[i]- pos[i-1]);
		}
		for(int i = 1;i < N+1;i++) {
			System.out.println(ans - Math.abs(pos[i]- pos[i-1]) - Math.abs(pos[i+1]- pos[i]) + Math.abs(pos[i+1]- pos[i-1]));
		}

	}

}
