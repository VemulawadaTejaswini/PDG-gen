import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + sc.nextInt();
		}
		printBool(sum >= h);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

}
