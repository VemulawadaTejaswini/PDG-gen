import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();

		int max1 = Math.max(n1, m1);
		int min2 = Math.min(n2, m2);

		if(n2 <= m1) {
			System.out.println(0);
		} else {
			System.out.println(min2 - max1);
		}
	}
}
