import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String exp = sc.next();
			String real = sc.next();
			int count = 0;
			for (int i = 0; i < 3; i++) {
				if (exp.charAt(i) == real.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}