import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		int[] east = new int[N+2];
		int[] west = new int[N+2];
		east[0] = 0;
		west[N+1] = 0;
		for(int i=1;i<=N;i++) {
			east[i] = (S.charAt(i-1)=='E')? east[i-1] : east[i-1] + 1;
			west[N+1-i] = (S.charAt(N-i)=='E')? west[N+2-i] + 1 : west[N+2-i];
		}
		int min = N;
		for(int i=1;i<=N;i++) {
			int sum = east[i-1] + west[i+1];
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}