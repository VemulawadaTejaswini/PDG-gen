/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i=1;i<=9;i++)list.add(i+"");
		int ind = 0;
		while(n>list.size()){
			String x=list.get(ind);
			int y = Integer.parseInt(x.charAt(x.length()-1)+"");
			if(y!=0)list.add(x+""+(y-1));
			list.add(x+""+(y));
			if(y!=9)list.add(x+""+(y+1));
			ind++;
		}
		System.out.println(list.get(n-1));
	}
}