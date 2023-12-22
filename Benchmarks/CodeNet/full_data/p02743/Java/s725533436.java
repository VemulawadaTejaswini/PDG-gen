import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		double ad = Math.sqrt(a);
		double bd = Math.sqrt(b);
		double cd = Math.sqrt(c);
		System.out.println(ad + bd < cd ? "Yes" : "No");
	}
}
