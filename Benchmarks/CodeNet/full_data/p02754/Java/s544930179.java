/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long a = input.nextLong();
		long b = input.nextLong();
		long ind=n;
		String s = "";
		while(n>0)
		{
		    if(n>=a){
    		    for(int i=1;i<=a;i++)
    		        s+="b";
    		    n=n-a;
		    }
		    else
		    {
		        for(int i=1;i<=n;i++)
		            s+="b";
		        break;
		    }
		    if(n>=b){
		        for(int i=1;i<=b;i++)
		            s+="r";
		        n=n-b;
		    }
		    else
		    {
		        for(int i=1;i<=n;i++)
		            s+="r";
		        break;
		    }
		}
		int count=0;
		for(long i=0;i<ind;i++)
		    if(s.charAt((int)i)=='b')
		        count++;
		System.out.println(count);
	}
}