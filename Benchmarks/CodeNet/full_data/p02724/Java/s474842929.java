
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher; 
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			int x=sc.nextInt();
			int sum=0;
			if(x/500>=1)
			{
				sum=sum+(x/500)*1000+((x%500)/5)*5;
			}
			else
			{
				sum=sum+(x/5)*5;
				
			}
			System.out.println(sum);
				
			
					
		     
		     }		
			
		
	}

	
	
	
}
		
