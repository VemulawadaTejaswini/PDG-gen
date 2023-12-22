import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char[] S = scn.nextLine().toCharArray();
		char[] T = scn.nextLine().toCharArray();
		int ans= S.length;

		for(int i = 0;i < S.length;i++) {
			for(int j = 0;j < T.length;j++) {
				if(S[i] == T[j]) {
					T[j] = (char)-1;
					ans--;
					break;
				}
			}
		}
		System.out.println(ans == 0?"Yes":"No");
		scn.close();
	}
}
