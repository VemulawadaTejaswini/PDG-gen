import java.util.*;
import java.io.*;
class Main
{

	public static void main(String args[])throws IOException
	{
		int a,b ;
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
      	if((Math.abs(a-b))%2==0)
			System.out.println(Math.min(a,b)+(Math.abs(a-b))/2);
		else
			System.out.println("Impossible");
		
	}
}