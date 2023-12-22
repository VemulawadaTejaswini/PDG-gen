
import java.util.Scanner;

public class Main {

	public static final long MAX_POINT = 1000000000L;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		long S = sc.nextLong();

		if(S <= MAX_POINT) {
			System.out.println(0 + " " + 0 + " " + 1 + " " + 0 + " " + 0 + " " + S);
		}else {
			System.out.println(0 + " " + 0 + " " + 1 + " " + 0 + " " + 0 + " " + S);
		}
	}

}
