/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int H = scan.nextInt();
		long[] arr = new long[N];
		long sum =0;
		for(int i=0;i<N;i++){
			arr[i] = scan.nextInt();
			sum+= arr[i];
		}
		if(H==0){
			System.out.println(sum);
		}else {
			if(H>=N){
							System.out.println(0);
			}
			else{
				long ans = 0;
				Arrays.sort(arr);
				for(int j=N-1-H;j>=0;j--){
					ans += arr[j];
				}
				System.out.println(ans);
			}
		}
		
}

}