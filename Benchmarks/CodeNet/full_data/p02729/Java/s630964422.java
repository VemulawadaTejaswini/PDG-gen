import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int m = scanner.nextInt();
	scanner.close();

	int numberOfEvenPairs = (n * (n - 1)) / 2 + (m * (m - 1)) / 2;

	System.out.println(numberOfEvenPairs);

    }
}