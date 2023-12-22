import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long hp = sc.nextLong(), n = sc.nextLong();
		long[][] array = new long[(int)n][2];
		for(int i=0;i<n;i++) {
			array[i][0]=sc.nextInt();
			array[i][1]=sc.nextInt();
		}
		long[] dp = new long[(int)hp+1];
		dp[0]=0;
		for(int i=1;i<=hp;i++) dp[i]=1000000000;
		for(int i=1;i<=hp;i++) {
			long min = 1000000000;
			for(int j=0;j<n;j++) {
				if(i-array[j][0]>=0) {
					if(dp[i-(int)array[j][0]]+array[j][1]<min) {
						min = dp[i-(int)array[j][0]]+array[j][1];
					}
				}
			}
			dp[i]=min;
		}
		System.out.println(dp[(int)hp]);
	}
}