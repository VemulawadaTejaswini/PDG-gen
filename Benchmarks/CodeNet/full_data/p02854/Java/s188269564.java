import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long[] a=new long[n];
		Arrays.setAll(a,i->s.nextLong()*2);
		Arrays.parallelPrefix(a,Long::sum);
//		System.err.println(a[n-1]/2);
//		System.err.println(Arrays.toString(a));

		long r=Long.MAX_VALUE;
		for(long i:a)
			r=Math.min(r,Math.abs(a[n-1]/2-i));
		System.out.println(r);
	}
}
