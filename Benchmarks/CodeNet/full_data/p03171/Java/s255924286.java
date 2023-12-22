
import java.util.Scanner;

public class Main{
	 public static  long stoneGame(int[] piles) {
		 long[][] dp = new long[piles.length + 1][piles.length];
			

			for (int gap = 0; gap < piles.length; gap++) {
				for (int i = 0, j = i + gap; j < piles.length; j++, i++) {
					if (gap == 0) {
						dp[i][j] = piles[i];
					} else {
						dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
					}

				}

			}
		
			return dp[0][piles.length - 1];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int piles[]=new int[n];
		for(int i=0;i<n;i++){
			piles[i]=scn.nextInt();
		}
		System.out.println(stoneGame(piles));
		

	}

}
