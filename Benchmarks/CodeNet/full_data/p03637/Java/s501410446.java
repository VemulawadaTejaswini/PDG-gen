import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int countOdd = 0;
		int countEven = 0;
		int fourTimes = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 2 == 0) {
				countEven++;
				if (a % 4 == 0) {
					fourTimes++;
				}
			} else {
				countOdd++;
			}
		}
		sc.close();
		
		if (n % 2 == 0) {
			if (fourTimes >= countOdd) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if (fourTimes >= countOdd - 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}