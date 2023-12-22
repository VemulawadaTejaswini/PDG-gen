import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a = in.nextInt();


			if(n % 500 == 0 || a < n)
				System.out.println("YES");
			else
				System.out.println("NO");
}}