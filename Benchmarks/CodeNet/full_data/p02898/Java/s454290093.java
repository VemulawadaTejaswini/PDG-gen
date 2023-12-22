/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int ans =0;
		for(int i=0;i<n;i++){
		    int x = s.nextInt();
		    if(x>=k){
		        ans++;
		    }
		}
		System.out.println(ans);
	}

}