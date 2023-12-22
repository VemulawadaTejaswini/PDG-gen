import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		long y = input.nextLong();
		int count = 0;
		while (x <= y) {
			x *= 2;
			count++;
		}
		System.out.println(count);
	}
}
