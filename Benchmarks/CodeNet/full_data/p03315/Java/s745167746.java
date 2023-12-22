import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		long count_plus = s.chars().filter(c -> c == '+').count();
		long count_minus = s.chars().filter(c -> c == '-').count();

		System.out.println(count_plus - count_minus);
	}
}