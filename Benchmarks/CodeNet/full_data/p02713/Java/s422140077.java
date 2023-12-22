import java.util.*;
public class Main{
	static int greatestCommonFactor(int a, int b, int c)
	{
		int limit;
	    limit = Math.min(a, b);
	    limit = Math.min(limit, c);
	    for(int n = limit; n >= 2; n--)
	    {
	        if ( (a % n == 0) && (b % n == 0) && (c % n == 0) ) {
	            return n;
	        }
	    }

	    return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int sum=0;
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=k;j++) {
				for(int z=1;z<=k;z++) {
					sum+=greatestCommonFactor(i,j,z);
				}
			}
		}
		System.out.println(sum);
	}
}