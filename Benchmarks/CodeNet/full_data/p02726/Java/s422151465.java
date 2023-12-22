import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[] ans = new int[n-1];

		for (int i=1; i<=n-1; i++){
			for (int j=i+1; j<=n; j++){
				int normal = j-i;
				int warp;
				warp = Math.abs(i-x) + 1 + Math.abs(j-y);
				int min = Math.min(normal, warp);
				ans[min -1]++;
			}
		}

		for (int i=0; i<ans.length; i++){
			System.out.println(ans[i]);
		}
	}
}