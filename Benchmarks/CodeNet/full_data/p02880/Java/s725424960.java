import java.util.*;

public class Main
{
	public static void main(String[] args)

	{
		//A

		//variables
		int num1, num2;

		//scanner
		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		//deciding output
		System.out.println("");
		if(((num1 <= 9) && (num1 >=1)&&((num2 <= 9) && (num2 >=1))))
		{

			System.out.println(num1*num2);
		}
		else

			System.out.println("-1");


		//B

		int n = num1*num2;

		if(((n <= 81) && (n >= 1))&&((num1 <= 9) && (num1 >=1)&&((num2 <= 9) && (num2 >=1))))
			System.out.println("Yes");

		else
			System.out.println("No");

	}
}