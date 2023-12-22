

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean f = false;

		if (A == B) {
			if (A != C) {
				f = true;
			}
		} else if (A == C) {
			if (A != B) {
				f = true;
			}
		} else if (B == C) {
			if (A != C) {
				f = true;
			}
		}

		if (f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}
