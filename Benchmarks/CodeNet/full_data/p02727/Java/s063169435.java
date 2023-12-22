import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
  public static void main(String args[])throws IOException
  {
    Scanner sc = new Scanner(System.in);
    int x,y,a,b,c;
    x=sc.nextInt();
    y=sc.nextInt();
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    Integer red[]=new Integer[a];
    Integer green[]=new Integer[b];
    Integer colour[]=new Integer[c];
    for(int i=0;i<a;i++)
    {
      red[i]=sc.nextInt();
    }
    for(int i=0;i<b;i++)
    {
      green[i]=sc.nextInt();
    }
    for(int i=0;i<c;i++)
    {
      colour[i]=sc.nextInt();
    }
	int total=0,f=0,ce=0;
	Arrays.sort(red,Collections.reverseOrder());
	Arrays.sort(green,Collections.reverseOrder());
	Arrays.sort(colour,Collections.reverseOrder());
	for(int i=0;i<x;i++)
	{
		f=0;
		for(int j=0;j<c;j++)
		{
			if(red[i]>=colour[j])
				f++;
			else
			{
				ce++;
				total=total+colour[j];
				
			}
		}
		if(f==c)
		{
			
			total=total+red[i];
			
		}
	}
	for(int i=0;i<y;i++)
	{
		f=0;
		for(int j=ce;j<c;j++)
		{
			if(green[i]>=colour[j])
				f++;
			else
			{
				ce++;
				total=total+colour[j];
				
			}
		}
		if(f==c)
		{
			total=total+green[i];
			
		}
	}
	System.out.println(total);
   }
}
      