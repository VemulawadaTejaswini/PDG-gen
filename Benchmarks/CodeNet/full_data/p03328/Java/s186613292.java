import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A = 0;
		int n = b - a;
		for(int i = 1; i < n; i++) {
			A += i;
		}
		System.out.println(A - a);
		sc.close();
	}
}
