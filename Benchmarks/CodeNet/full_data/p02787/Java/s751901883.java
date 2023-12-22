import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hp = sc.nextInt(), n = sc.nextInt();
		int[][] array = new int[n][2];
		int max=0;
		for(int i=0;i<n;i++) {
			array[i][0]=sc.nextInt();
			array[i][1]=sc.nextInt();
			if(array[i][0]>max) max = array[i][0];
		}
		int[] dp = new int[hp+1+max];
		dp[0]=0;
		for(int i=1;i<=hp+max;i++) dp[i]=1000000000;
		for(int i=1;i<=hp+max;i++) {
			int min = 1000000000;
			for(int j=0;j<n;j++) {
				if(i-array[j][0]>=0) {
					if(dp[i-array[j][0]]+array[j][1]<min) {
						min = dp[i-array[j][0]]+array[j][1];
					}
				}
			}
			dp[i]=min;
		}
		int min = 1000000000;
		for(int i=hp;i<=hp+max;i++) {
			if(dp[i]<min) min = dp[i];
		}
		System.out.println(min);
	}
}
