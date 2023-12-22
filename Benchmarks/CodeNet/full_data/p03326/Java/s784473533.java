import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long[] kirei=new long[n];
		long[] oishi=new long[n];
		long[] ninki=new long[n];
		for(int i=0;i<n;i++){
			kirei[i]=sc.nextLong();
			oishi[i]=sc.nextLong();
			ninki[i]=sc.nextLong();
		}
		
		long[][]value = new long[8][n];
		long score=0;
		for(int i=0;i<8;i++){
			for(int j=0;j<n;j++){
				value[i][j]+=(i&4)==0?kirei[j]:-kirei[j];
				value[i][j]+=(i&2)==0?oishi[j]:-oishi[j];
				value[i][j]+=(i&1)==0?ninki[j]:-ninki[j];
			}
			Arrays.sort(value[i]);
			long sum=0;
			for(int j=0;j<m;j++){
				sum+=value[i][n-1-j];
			}
			score=Math.max(score,sum);
		}
		System.out.println(score);		
	}	
}
