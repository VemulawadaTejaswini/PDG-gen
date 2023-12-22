/**
 * 
 */
//package AtCoder;
import java.util.*;
/**
 * @author Shivansh Singh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,k,i,min,j,p;
		n=sc.nextInt();
		k=sc.nextInt();
		int []arr=new int[n];
		for (i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int []dp=new int[n+1];
		dp[0]=dp[1]=0;
		for (i=2;i<=n;i++) {
			j=i-1;
			min=dp[i-1]+(int)Math.abs(arr[i-1]-arr[i-2]);
			while(j>=1 && (i-j)<=k) {
				p=dp[j]+(int)Math.abs(arr[i-1]-arr[j-1]);
				min=(int)Math.min(min,p);
				j--;
			}
			dp[i]=min;
		}
		System.out.println(dp[n]);
		sc.close();
	}

}
