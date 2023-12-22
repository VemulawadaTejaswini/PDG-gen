import java.util.*;

class Main
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// System.out.println(div);
		long sum = 0;
		for (int i =0 ;i<n ;i++ ) 
		{
			int aa = s.nextInt();
			sum+=aa;	
		}
		long ans  = sum;
		if(n <= 25 )
		{
			long mul = (long)(Math.pow(2,n-1)) ;
			ans = ans*mul;
			long div = (long)(Math.pow(2,n)) - 1;
			ans = ans/div;
			System.out.println(ans);
			
		}
		else
			System.out.println(sum/2);
		// System.out.println(ans);
		// System.out.println(ans);
		
		
		


	}
}