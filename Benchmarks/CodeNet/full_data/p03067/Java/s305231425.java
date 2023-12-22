import java.util.HashMap;
import java.util.Scanner;

// A - On the Way
public class Main {
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	static String[] s;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();

	if (Math.min(A, B) <= C && Math.max(A, B) >= C) {
		System.out.println("Yes");
	} else {
		System.out.println("No");
	}
	}
}