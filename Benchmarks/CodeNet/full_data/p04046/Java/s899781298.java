import java.util.Scanner;

public class Main {
	static final int DIV = 1000000000+7;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		long[][] dp1 = new long[H-A][W];
		long[][] dp2 = new long[A][W-B];

		dp1[0][0]=1;
		for(int i=0;i<H-A;i++) {
			for(int j=0;j<W;j++) {
				if(i==0&&j==0) continue;
				if(i==0) {
					dp1[i][j]= dp1[i][j-1];
				}
				else if(j==0) {
					dp1[i][j]= dp1[i-1][j];
				}
				else {
					dp1[i][j] = (dp1[i-1][j]+dp1[i][j-1])%DIV;
				}
			}
		}
		dp2[0][0] = dp1[H-A-1][B];
		for(int i=0;i<A;i++) {
			for(int j =0;j<W-B;j++) {
				if(i==0&&j==0) continue;
				if(i==0) {
					dp2[i][j]=dp2[i][j-1]+dp1[H-A-1][B+j];
				}
				else if(j==0) {
					dp2[i][j]=dp2[i-1][j];
				}
				else {
					dp2[i][j]=(dp2[i-1][j]+dp2[i][j-1])%DIV;
				}
			}
		}
		System.out.println(dp2[A-1][W-B-1]);
		scanner.close();
	}

}
