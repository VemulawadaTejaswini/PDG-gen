import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt() / 2;
		int ans = x + y;
		System.out.println(ans);
		sc.close();
	}
}
