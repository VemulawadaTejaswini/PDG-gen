
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static List<Integer> numbers;

    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int nEvenBalls = scanner.nextInt();
	int mOddBalls = scanner.nextInt();
	scanner.close();

	numbers = new ArrayList<>();
	generateNumbers(nEvenBalls, true);
	generateNumbers(mOddBalls, false);

	int numberOfEvenPairs = 0;

	for (int i = 0; i < numbers.size(); i++)
	{
	    for (int j = i + 1; j < numbers.size(); j++)
	    {
		int sum = numbers.get(i) + numbers.get(j);

		if ((sum % 2) == 0)
		{
		    // even
		    numberOfEvenPairs++;
		}
	    }
	}

	System.out.println(numberOfEvenPairs);

    }

    private static void generateNumbers(int howMany, boolean even)
    {
	for (int i = 1; i <= howMany; i++)
	{
	    numbers.add(even ? 2 : 1);
	}
    }

}
