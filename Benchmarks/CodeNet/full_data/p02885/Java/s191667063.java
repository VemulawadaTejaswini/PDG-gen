import java.util.*;
import java.text.*;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Input: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int answer = a - b * 2;
		if(answer <= 0)
			System.out.println(0);
		else
			System.out.println(answer);
	}
}