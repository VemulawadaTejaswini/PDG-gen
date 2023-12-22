import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		System.out.println((int)Math.ceil(N/2.0)*((int)Math.ceil(N/2.0)-1));
	}
}
