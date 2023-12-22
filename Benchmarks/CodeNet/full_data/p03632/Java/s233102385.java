import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		if (C < A) {
			System.out.println(Math.min(B, D) - C);
		} else if (A < C & C > B) {
			System.out.println(0);
		} else {
			System.out.println(B - C);
		}
		sc.close();
	}

}
