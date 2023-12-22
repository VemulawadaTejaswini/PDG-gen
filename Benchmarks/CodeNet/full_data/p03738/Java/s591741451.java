import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();

		if(a == b) System.out.print("EQUAL");
		else if(a.compareTo(b) == 1) System.out.print("GREATER");
		else System.out.print("LESS");
	}
}