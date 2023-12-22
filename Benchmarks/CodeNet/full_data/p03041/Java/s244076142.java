

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String[] S = new String[N];
		for(int i = 0 ; i < N ;i++)
		{
			S[i] = sc.next();
		}

		 String str = S[K];
		String str2 = str.toLowerCase();

		for(int i = 0 ; i < K ;i++)
		{
			System.out.print(S[i]);
		}

		System.out.print(str2);

		for(int i = K + 1 ; i < N ;i++)
		{
			System.out.print(S[i]);
		}
	}

}