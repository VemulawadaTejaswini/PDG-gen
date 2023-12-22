import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = s.matches("A??KIHA??BA??RA??") ? "YES" : "NO";
		System.out.println(ans);
	}
}
