
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = Long.valueOf(scan.nextLine());
		long count = 0;
		count = x / 11 * 2;
		if(x % 11 >= 1 && x % 11 <= 6) {
			count++;
		} else if(x % 11 > 6) {
			count += 2;
		}
		System.out.println(count);
		scan.close();

	}

}
