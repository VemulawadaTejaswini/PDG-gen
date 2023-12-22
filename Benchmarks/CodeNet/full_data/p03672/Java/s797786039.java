import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] a = str.split("");
//        System.out.println(a[0]);
		int num = a.length;
		String sum0 = "";
		String sum1 = "";
		int ans = 0;;
		
 		for(int i=0; i<num/2; i++ ){
 			sum0 = sum0 + a[i];
 			for(int j=i+1; j<2*i+2; j++ ){
 				sum1 = sum1 + a[j];
 				
 			}
 			if (sum0.equals(sum1)){
 				ans = i+1;
 			}
 			sum1 = "";
 		}
 		System.out.println(ans);
	}
}