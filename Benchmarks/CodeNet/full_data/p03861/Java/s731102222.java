import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		int count = 0;
		for (long i = a; i <= b; i++) {
			long result = i % x;
			if(result == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}