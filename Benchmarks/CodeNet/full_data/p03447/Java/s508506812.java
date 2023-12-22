import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		X -= A;
		int t = X / B;
		int res = X - t * B;
		System.out.println(res);
	}
}