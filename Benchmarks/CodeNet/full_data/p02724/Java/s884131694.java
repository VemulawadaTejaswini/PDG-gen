import java.util.*;
import java.lang.*;
import java.io.*;
 public class Main
{
	public static void main (String[] args)
	{
			Scanner sc = new Scanner(System.in);
			long x = sc.nextLong();
			long sum500 = x / 500;
			long x2 = x - (sum500 * 500);
			long sum5 = x2 / 5;
			System.out.println(1000*(sum500) + 5*sum5); 
	}
}
