import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int i = Integer.parseInt(a + b);
		int root = (int)Math.sqrt(i);
		System.out.println(root * root == i ? "Yes" : "No");
	}
}
