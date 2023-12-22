import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;
		for (int i = A; i < B; i++) {
			String n = String.valueOf(i);
			if (n.charAt(0) == n.charAt(4)) {
				if (n.charAt(1) == n.charAt(3)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}