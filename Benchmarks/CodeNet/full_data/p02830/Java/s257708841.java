import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] S = scn.nextLine().toCharArray();
		for(int i = 0;i < N;i++) {
			System.out.print(S[i]);
			System.out.print(S[N+1+i]);
		}
	}

}
