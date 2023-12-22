import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = 1;
		for (int i = 0; i < n; i++) {
			if (a*2 <= a+k) {
				a = a*2;
			} else {
				a = a+k;
			}
		}
		System.out.println(a);
	}
}
