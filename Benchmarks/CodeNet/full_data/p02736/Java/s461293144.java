import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
	public static int g=0;
	public static int fun(int i,int j,int[] arr){
		if(i==1){
			return arr[j-1];
		}else{
			int x=Math.abs(fun(i-1,j,arr)-fun(i-1,j+1,arr));
			return x;
		
		}
		
		

	}
	public static void main(String[] arg){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=in.next();
		int[] arr=new int[n];
		for(int k=0;k<n;k++){
			char c=s.charAt(k);

			arr[k]=Integer.parseInt(String.valueOf(c));
		}
		int ans=fun(n,1,arr);
		System.out.println(ans);

	}
}