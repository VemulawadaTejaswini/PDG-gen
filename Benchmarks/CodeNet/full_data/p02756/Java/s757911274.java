/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		StringBuilder sb = new StringBuilder(s);
		int q = input.nextInt();
		while(q-->0)
		{
		    int x = input.nextInt();
		    if(x==2)
		    {
		        int y = input.nextInt();
		        String str = input.next();
		        if(y==1)
		        {
		            sb.insert(0,str);
		        }
		        else{
		            sb.append(str);
		        }
		        
		    }
		    else{
		        sb.reverse();
		    }
		}
		
		System.out.println(sb.toString());
		
	}
}