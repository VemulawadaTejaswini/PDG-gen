import java.util.Scanner;

class Main {
	
	public static boolean isPalindromic(int n) {
		boolean a = false;
		if (n / 100 == n % 10) {
			a = true;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalindromic(n));
		sc.close();
	}

}
