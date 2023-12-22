import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		long grad500 = x / 500L * 1000L;
		x -= x / 500L * 500L;
		long grad5 = x / 5L * 5L;
		long ans = grad500 + grad5;
		System.out.println(ans);
	}

}
