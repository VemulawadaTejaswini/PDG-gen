import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		double[] dp=new double[N+1];
		for(int i=0; i<=N; i++) {
			dp[i]=0;
		}
		dp[0]=1;
		double[] kakuritu=new double[N];
		for(int i=0; i<N; i++) {
			kakuritu[i]=sc.nextDouble();
		}
		for(int i=0; i<N; i++) {
			for(int j=i; j>=0; j--) {
				dp[j+1]+=dp[j]*kakuritu[i];
				dp[j]*=(1.000d-kakuritu[i]);
			}
		}
		double sum=0;
		for(int i=(N+1)/2; i<=N; i++) {
			sum+=dp[i];
		}
		System.out.println(sum);
	}
}