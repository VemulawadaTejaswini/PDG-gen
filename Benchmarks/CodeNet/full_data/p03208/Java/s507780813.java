import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
public class Main
{
	static Scanner sc=new Scanner(System.in);
	static final int MAX=100000+5;
	public static void main(String[] args)
	{
		long n=sc.nextInt();
		long k=sc.nextInt();
		long[] a=new long[MAX];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		Arrays.sort(a,0,(int) n);
		System.out.println(Math.min(Math.abs(a[(int) (k-1)]-a[0]),Math.abs(a[(int) (n-1)]-a[(int) (n-k)])));
	}
}