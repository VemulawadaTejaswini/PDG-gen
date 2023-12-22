import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
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
	int total=0;//,f=0,ce=0;
	Arrays.sort(red,Collections.reverseOrder());
	Arrays.sort(green,Collections.reverseOrder());
	Arrays.sort(colour,Collections.reverseOrder());
	//Integer abc[]=new Integer[a+b+c];
	ArrayList<Integer> abc=new ArrayList<Integer>(a+b+c);
	for(int i=0;i<x;i++)
	{
		abc.add(red[i]);
	}
	for(int j=0;j<y;j++)
	{
		abc.add(green[j]);
	}
	for(int i=0;i<c;i++)
	{
		abc.add(colour[i]);
	}
	abc.trimToSize();
	Collections.sort(abc,Collections.reverseOrder());
	for(int i=0;i<x+y;i++)
	{
		total=total+abc.get(i);
	}
	System.out.println(total);
   }
}
      