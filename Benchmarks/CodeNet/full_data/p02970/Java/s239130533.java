import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = Double.parseDouble(sc.next());
		double d = Double.parseDouble(sc.next());

		System.out.println((int)Math.ceil(n / (d*2+1)));
	}
}