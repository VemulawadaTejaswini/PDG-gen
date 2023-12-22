import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = b - a;
		int t = s * (s + 1) / 2;
		System.out.println(t - b);
	}
}