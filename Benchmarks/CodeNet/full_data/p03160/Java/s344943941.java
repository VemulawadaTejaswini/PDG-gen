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
		int n,i;
		n=sc.nextInt();
		int []arr=new int[n];
		for (i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int []dp=new int[n+1];
		dp[0]=dp[1]=0;
		dp[2]=(int)Math.abs(arr[1]-arr[0]);
		for (i=3;i<=n;i++)
			dp[i]=(int)Math.min(dp[i-1]+Math.abs(arr[i-1]-arr[i-2]),dp[i-2]+Math.abs(arr[i-1]-arr[i-3]));
		System.out.println(dp[n]);
		sc.close();
	}

}
