import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] inputArr = input.split("");
		String output = "Yes";

		for(int i = 0; i < inputArr.length; i++)
		{
			if(i%2 == 0)
			{
				if(inputArr[i].matches("R|U|D"))
				{
					continue;
				}
				else
				{
					output = "No";
					break;
				}
			}
			else
			{
				if(inputArr[i].matches("L|U|D"))
				{
					continue;
				}
				else
				{
					output = "No";
					break;
				}
			}
		}

		System.out.print(output);	
	}
}