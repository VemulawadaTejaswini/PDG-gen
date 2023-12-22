import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.nextLine().toCharArray();
		char[] b = sc.nextLine().toCharArray();
		for (int i = 0; i < 3; i++) {
			if (a[i] != b[2-i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
