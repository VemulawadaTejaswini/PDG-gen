import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 100000;
		long power = 1;
		for (int i = 1; i <= N; i++) {
			power = (long) (power * i % (Math.pow(10, 9)+7));
			 System.out.println(i+":"+power);
		}
		System.out.println(power);
	}
}