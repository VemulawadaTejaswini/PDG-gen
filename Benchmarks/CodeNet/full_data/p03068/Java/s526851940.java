import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int K = sc.nextInt();

		char replace = S[K - 1];

		for(int i = 0; i < N; i++) {
			if(S[i] != replace) {
				S[i] = '*';
			}
		}

		System.out.println(String.valueOf(S));
	}
}