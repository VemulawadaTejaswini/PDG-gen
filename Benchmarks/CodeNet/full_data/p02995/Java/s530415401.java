import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long count = 0;
		for(long i= A; i<B+1; i ++)
		{
		    if(i%C != 0 && i%D != 0)
		    {
		        count +=1;
		    }
		}
		System.out.println(count);
	}
}
