import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String s = sc.next();
		sc.close();
		System.out.println(s.matches("[0-9]{" + a + "}-[0-9]{" + b + "}") ? "Yes" : "No");
	}
}