

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char a = str.charAt(0);
		char b = str.charAt(1);
		
		if(str.charAt(2)==a && str.charAt(3)==b)
		{
			System.out.println("Good");
		}
		else
			System.out.println("Bad");
	}
}
