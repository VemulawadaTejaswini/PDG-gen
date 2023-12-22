import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int[] x= {sc.nextInt(),sc.nextInt()};
		int[][] d= new int[2][n+1];
		int a=0;int[] index= {0,0};
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='T') {
				a=1-a;
			}
			else {
				while(true) {
				d[a][index[a]]++;
				if(i==n-1||s.charAt(i+1)=='T')break;
				i++;
				}
				index[a]++;
			}
		}
		int axis=0;
		boolean dp[]=new boolean[16001];
		dp[8001+d[axis][0]]=true;
		for(int i=1;d[axis][i]!=0;i++) {
			boolean[] nextdp=new boolean[16001];
			for(int j=8001-i;j<=8001+i;j++) {
				if(dp[j]) {
					nextdp[j+d[axis][i]]=true;
					nextdp[j-d[axis][i]]=true;					
				}
			}
			dp=nextdp;
		}
		if(!dp[8001+x[axis]]) {
			System.out.println("No");
			return;
		}
		axis=1;
		dp=new boolean[16001];
		dp[8001]=true;
		for(int i=0;d[axis][i]!=0;i++) {
			boolean[] nextdp=new boolean[16001];
			for(int j=8001-i;j<=8001+i;j++) {
				if(dp[j]) {
					nextdp[j+d[axis][i]]=true;
					nextdp[j-d[axis][i]]=true;					
				}
			}
			dp=nextdp;
		}
		if(!dp[8001+x[axis]]) {
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
		
		
		}
	}
