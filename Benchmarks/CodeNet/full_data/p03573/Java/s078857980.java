/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
		int arr[]={a,b,c}
		Arrays.sort(arr);
		for(int i=0;i<1;i++){
		    if(arr[i]==arr[i+1]){
		        if(i==0){
		            out.println(arr[2]);
		            return;
		        }
		        else if(i==1){
		            out.println(arr[0]);
		            return;
		        }
		    }
		}
		out.println(arr[1]);
	}
}
