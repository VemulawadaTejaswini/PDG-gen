import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = new StringBuffer(sc.next()).reverse().toString();

		System.out.println(a.equals(b) ? "YES" : "NO");

		sc.close();

	}

}
