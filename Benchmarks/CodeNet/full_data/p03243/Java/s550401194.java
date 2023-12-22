import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for (int i = 111; i < 1000; i += 111) {
			if (N <= i) {
				System.out.println(i);
				return;
			}
		}
	}
}
