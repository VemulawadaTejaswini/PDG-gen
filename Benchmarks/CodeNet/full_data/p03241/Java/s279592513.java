import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();

			//int[][]dp = new int[N][M];

			//dp[1][1] = 1;
			int max = 0;
			for(int i = 1;i<=N;i++) {
				if(M%i==0) {
					int wari = M/i;
					if(wari>=N) {
						max = i;
					}
				}
			}

			System.out.println(max);
		}


	}

	private static int gcd(int A,int B){//最大公約数
		return B==0?A:gcd (B,A%B);
	}


}
