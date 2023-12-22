import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int sLen = s.length();
		int tLen = t.length();
		StringBuilder[][]lcs = new StringBuilder[sLen+1][tLen+1];
		for (int i=0;i<=sLen;i++) {
				lcs[i][0]=new StringBuilder();
		}
		for (int j=0;j<=tLen;j++) {
			lcs[0][j]=new StringBuilder();
	}

		for (int i=1;i<=sLen;i++) {
			for (int j=1;j<=tLen;j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					lcs[i][j]=new StringBuilder(lcs[i-1][j-1]);
					lcs[i][j].append(s.charAt(i-1));
				} else if (lcs[i-1][j].length() > lcs[i][j-1].length()){
					lcs[i][j]=lcs[i-1][j];
				} else {
					lcs[i][j]=lcs[i][j-1];
				}
			}
		}

		System.out.println(lcs[sLen][tLen]);
	}

}