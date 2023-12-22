import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if((s.contains("E")&&!s.contains("W"))||(s.contains("W")&&!s.contains("E"))) {
			System.out.println("No");
			return;
		}
		if((s.contains("N")&&!s.contains("S"))||(s.contains("S")&&!s.contains("N"))) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}