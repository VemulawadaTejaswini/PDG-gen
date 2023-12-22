import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N;
		String S;
		N = stdIn.nextInt();
		S = stdIn.next();
		if(N == 1) {
			System.out.println("No");
			return;	
		}
		for(int i = 0; i < N / 2; i++) {
			if(S.charAt(i) != S.charAt(i + (N / 2))) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}