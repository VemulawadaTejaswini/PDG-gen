import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int dif = a - b;
		int pro = a * b;
		System.out.println(Math.max(sum, Math.max(dif, pro)));
	}
}