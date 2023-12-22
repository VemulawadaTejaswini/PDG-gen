package test.com.study.atcorder;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		var sc = new Scanner(System.in);
		var A = sc.nextInt();
		var B = sc.nextInt();
		var res = 0;

		if((1 <= A && 9 >= A) && (1 <= B && 9 >= B))
		{
			res = A * B;
			System.out.println(res);
		}
		else
		{
			res = -1;
			System.out.println(res);
		}
	}
}