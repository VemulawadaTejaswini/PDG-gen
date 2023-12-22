import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long power = 1;
		long a = 1000000007;
		for(int i = 1; i <= n; i++) {
			power = (power * i) % a;
		}
		System.out.println(power);
	}
}