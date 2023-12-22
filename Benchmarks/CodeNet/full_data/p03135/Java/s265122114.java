
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double T = Integer.parseInt(scan.next());
		double X = Integer.parseInt(scan.next());

		System.out.println(String.format("%.10f", T/X));
	}
}
