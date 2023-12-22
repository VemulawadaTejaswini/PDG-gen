import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
public class Main
{
	static Scanner sc=new Scanner(System.in);
	static final int MAX=100000+5;
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[MAX];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a,0,n);
		int ans=100000000;
		for(int i=0;i+k<=n;i++)
			ans=Math.min(ans,Math.abs(a[i]-a[k+i-1]));
		System.out.println(ans);
	}
}