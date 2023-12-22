import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		for (long i = 1; i * i < n; i++) {
			if (n % i == 0) {
				sum += n / i - 1;
			}
		}
		System.out.println(sum);
	}
}