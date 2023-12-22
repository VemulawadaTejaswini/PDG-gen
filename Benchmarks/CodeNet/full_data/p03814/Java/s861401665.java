import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int a = s.indexOf("A");
		int x = s.lastIndexOf("X");
		System.out.println(x - a +1);
	}
} 