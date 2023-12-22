import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String b = stdIn.next();
		char[] a = new char[4];
		for (int j = 0; j < 4; j++) {
			a[j] = b.charAt(j);
		}
		int N = 0;
		for (int i = 0; i < 4; i++) {
			if (a[i] == '2') 
				N = N + 1;
		}

		System.out.println(N);

	}
}