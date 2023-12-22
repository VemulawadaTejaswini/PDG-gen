import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		sc.close();

		double res = (double)T/X;

		System.out.println(res);
	}

}
