/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static int MOD=1000000007;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		s=br.readLine().split(" ");
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=Integer.parseInt(s[i]);
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++){
			int count=0;
			for(int j=0;j<N;j++){
				if(A[j]<A[i])
					count++;
			}
			hm.put(i,count);
		}
		//System.out.println(hm);
		long total=0;
		long factor=((long)k*((long)k-1));
		factor>>=1;
		factor%=MOD;
		for(int i=0;i<N;i++){
			total=(total+((hm.get(i)%MOD)*(factor)%MOD)%MOD);
		}
		int sum=0;
		int[] small=new int[N];
		for(int i=0;i+1<N;i++){
			for(int j=i+1;j<N;j++){
				if(A[i]>A[j]){
					small[i]++;
				}
			}
		}
		//System.out.println();
		for(int i=0;i<N;i++){
			sum=sum+small[i];
		}
		total=(total+((sum%MOD)*(k%MOD))%MOD)%MOD;
		System.out.println(total);
	}
}