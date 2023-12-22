import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cost1 = 0; int cost2 = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		for(int i = 0; i < m; i++) {
			if(sc.nextInt() < x) cost1++;
			else cost2++;
		}
		System.out.println(Math.min(cost1, cost2));
		sc.close();
	}
}