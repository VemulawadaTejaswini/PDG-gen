import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}
	
	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int T = sc.nextInt();
		int mincost = 1001;
		for (int i=0; i<N; i++) {
			int cost = sc.nextInt();
			int time = sc.nextInt();
			if (time <=T) {
				mincost = Math.min(mincost, cost);
			}
		}
		if (mincost == 1001) {
			System.out.println("TLE");
		}
		else {
			System.out.println(mincost);
		}
		
	}
	
}