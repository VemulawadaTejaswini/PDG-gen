import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a = in.nextInt();


			int rem = 0, res = 0;
			if(n >= 500)
			{
				rem = n % 500;
				res = a - rem;
				if(res >= 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else 
			{
				res = a - n;
				if(res >= 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
}}