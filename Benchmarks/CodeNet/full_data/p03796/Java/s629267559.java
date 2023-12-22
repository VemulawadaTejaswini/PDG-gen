import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		long mod = 1_000_000_007;
		
		long power = 1;
		for (int i = 1; i <= N; i++) {
			power *= i;
			power %= mod;
		}
		
		System.out.println(power);		
	}
}
