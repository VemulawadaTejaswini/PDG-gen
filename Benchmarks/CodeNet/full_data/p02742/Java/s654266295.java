import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		long x = H * W / 2;
		if (H * W  % 2 != 0) {
			x++;
		}
		System.out.println(x);
	}
}