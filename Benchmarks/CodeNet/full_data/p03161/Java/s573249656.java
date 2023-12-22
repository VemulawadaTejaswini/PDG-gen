import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] stones = new int[n];
		int[] sol = new int[n];
		for (int i = 0; i < n; i++) {
			stones[i]=s.nextInt();
		}
		sol[0]=0;
		sol[1]=Math.abs(stones[0]-stones[1]);
		for (int i = 2; i < sol.length; i++) {
			int solid = Math.abs(stones[i-1]-stones[i])+sol[i-1];
			for (int j = 2; j <= k&&i-j>=0; j++) {
				solid=Math.min(solid,(Math.abs(stones[i-j]-stones[i])+sol[i-j]));
			}
			sol[i]=solid;
			
		}
		System.out.println(sol[n-1]);
	}

}
