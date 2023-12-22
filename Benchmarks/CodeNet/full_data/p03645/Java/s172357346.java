import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String ans = "IMPOSSIBLE";
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] route = new int[m][2];
		for (int i=0; m > i; i++) {
			route[i][0] = sc.nextInt();
			route[i][1] = sc.nextInt();
			for (int j=0; i > j; j++) {
				if(route[j][0] == 1 && route[j][1] == route[i][0] && route[i][1] == n) {
					ans = "POSSIBLE";
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}
