import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = 0;
		String b = stdIn.next();
		char[] a = new char[4];
		for (int j = 0; j < 4; j++) {
			a[j] = b.charAt(j);
		}
		for (int i = 0; i < 4; i++) {
			if (a[i] == '+') 
				N = N + 1;
			else
				N = N - 1;
		}


		System.out.print(N);
	}
}