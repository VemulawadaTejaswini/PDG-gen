import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		long LS = 4*a*b;
		long RS = c-a-b;
		RS*=RS;
		System.out.println(RS>LS?"Yes":"No");
	}
}