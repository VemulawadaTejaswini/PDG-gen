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
		System.out.println(Math.min(Math.abs(a[k-1]-a[0]),Math.abs(a[n-1]-a[n-k])));
	}
}