

import java.util.*;
import java.io.*;

public class Main
{
	
	public static final Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	public static void main(String[] __fuad)
	{
		int m=input.nextInt();
		int d=input.nextInt();
		
		
		System.out.println(TakahashiCalendar(m,d));
		
	}
	
	
	public static int TakahashiCalendar(int m,int d)
	{
		
		 
		
		int cnt=0;
		
		 if(d>21)
		 {
			 for(int i=22;i<=d;++i)
			 {
				 int one=i%10;
				 int two=i/10;
				 
				 if(one>1&& one*two<=m)
				 {
					 cnt++;
					 
				 }
			 }
		 }
		 
		return cnt;
	}
}