import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] S = scn.next().toCharArray(), T = scn.next().toCharArray();
		int A = scn.nextInt(), B = scn.nextInt();
		scn.nextLine();
		char[] U = scn.next().toCharArray();
		boolean a = true;
		for(int i = 0;i < S.length;i++) {
			a &= S[i] == U[i];
		}
		System.out.println((a)?(A-1) + " " + B:A + " " + (B-1));
	}

}