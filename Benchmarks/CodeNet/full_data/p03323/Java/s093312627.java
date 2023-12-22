import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int l = 16 - (a+b);
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println(max <= min + l ? "Yay!" : ":(");
	}
}