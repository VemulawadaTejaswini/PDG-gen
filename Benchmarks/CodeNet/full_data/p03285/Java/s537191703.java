import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean hasPattern = false;
		for (int i = 0; i <= N && hasPattern == false; i += 4) {
			for (int j = 0; j <= N && hasPattern == false; j += 7) {
				int sum = i + j;
				if (sum == N)
					hasPattern = true;
			}
		}
		System.out.println(hasPattern ? "Yes" : "No");
		sc.close();
	}
}