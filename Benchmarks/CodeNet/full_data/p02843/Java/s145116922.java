import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int num = n / 100;
		int mod = n % 100;
		if (num * 5 < mod) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

}