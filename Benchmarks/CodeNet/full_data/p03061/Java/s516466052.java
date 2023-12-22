
import java.util.Scanner;

public class Main {

	static int gcd(int a, int b) 
	{ 
	    if (a == 0) 
	        return b; 
	    return gcd(b % a, a); 
	} 

	static int findGCD(int arr[], int n, int iExclude) 
	{ 
	    int result = arr[0];
	    if(iExclude == 0) result = arr[1];
	    for (int i = 1; i < n; i++) {
	    	if(i==iExclude) continue;
	        result = gcd(arr[i], result); 
	    }
	  
	    return result; 
	} 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		int ans = findGCD(a, n, -1);
		
		if(n > 2)
			for(int i=0; i<n; i++) {
				int gcd = findGCD(a, n, i);
				if(gcd > ans) 
					ans = gcd;
			}
		
		System.out.println(ans);
		
		in.close();

	}

}
