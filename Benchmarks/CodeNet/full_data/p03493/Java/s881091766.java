
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String s = scan.next();
		if(s.substring(0, 1).equals("1")) {
			sum++;
		}
		if(s.substring(1, 2).equals("1")) {
			sum++;
		}
		if(s.substring(2, 3).equals("1")) {
			sum++;
		}
		System.out.println(sum);
		scan.close();

	}

}
