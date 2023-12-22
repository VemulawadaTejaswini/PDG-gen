import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 100;
		for(int i = 0; i < N; i++) {
			long A = sc.nextLong();
			int count = 0;
			for(;A % 2 == 0;count++) {
				A /= 2;
			}
			min = Math.min(min, count);
		}
		System.out.println(min);
	}
}
