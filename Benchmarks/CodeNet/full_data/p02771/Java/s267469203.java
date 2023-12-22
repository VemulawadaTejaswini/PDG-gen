import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		int len = 3;

		Scanner sc = new Scanner(System.in);
		Set<Integer> number = new HashSet<Integer>();
		int count = 0;
		while (count < len) {
			number.add(sc.nextInt());
			count++;
		}
		if (number.size() == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
