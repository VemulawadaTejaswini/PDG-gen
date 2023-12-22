import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(s.chars().filter(c -> c == 'o').count() * 100 + 700);
	}
}