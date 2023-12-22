/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);;
		int n = scan.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int count = 0;
		if(n<=2){
			if(arr[0]==arr[1]){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		}
		else{
		for(int j = 2;j<n;j++){
			if(arr[j-2]==arr[j]){
				System.out.println("NO");
				count +=1;
				break;
			}
		}
		if(count==0){
			System.out.println("YES");
		}
		}
		
		// your code goes here
	}
}