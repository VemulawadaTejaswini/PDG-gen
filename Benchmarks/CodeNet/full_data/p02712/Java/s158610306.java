
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long sum = 0;
		int j = Integer.valueOf(s);
		for (int i = 1; i <= j; i++) {
			if((i % 3 != 0 && i % 5 != 0)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
