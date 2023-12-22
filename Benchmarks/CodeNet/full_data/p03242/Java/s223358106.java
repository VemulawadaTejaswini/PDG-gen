import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		n = n.replace("1", "X");
		n = n.replace("9", "1");
		n = n.replace("X", "9");
		System.out.println(n);
	}
}