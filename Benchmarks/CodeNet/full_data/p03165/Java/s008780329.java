import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int sLen = s.length();
		int tLen = t.length();
		int[][] len = new int[sLen+1][tLen+1];

		for (int i=1;i<=sLen;i++) {
			for (int j=1;j<=tLen;j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					len[i][j]=len[i-1][j-1]+1;
				} else {
					len[i][j]=Math.max(len[i-1][j], len[i][j-1]);
				}
			}
		}
		String ans = "";
		int ansLen = len[sLen][tLen];
		int i = sLen;
		int j = tLen;
		while (ans.length()<ansLen) {
			if (s.charAt(i-1)==t.charAt(j-1)) {
				ans = s.charAt(i-1)+ans;
				i--;
				j--;
			} else if (len[i-1][j] > len[i][j-1]) {
				i--;
			} else {
				j--;
			}
		}
		System.out.println(ans);
	}	
}