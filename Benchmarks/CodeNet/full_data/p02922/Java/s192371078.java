import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 1;
		int count = 0;
		while (sum < B) {
			sum = sum + A - 1;
			count++;
		}
		System.out.println(count);
	}
}
