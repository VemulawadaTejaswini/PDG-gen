import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int X;
		Scanner sc = new Scanner(System.in);
		X = Integer.parseInt(sc.next());
		int mod = 0;
		int c_500 = X / 500;
		mod = X % 500;
		int c_5 = mod / 5;
		System.out.println(c_500 * 1000 + c_5 * 5);

	}

}