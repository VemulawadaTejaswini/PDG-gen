import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int sum = 0;
		int i = 0;
		while (sum < n) {
			i++;
			sum += i;
		}
		int ex = sum - n;
		for (int j = 1; j <= i; j++) {
			if (j != ex) {
				System.out.println(j);
			}
		}
	}
}
