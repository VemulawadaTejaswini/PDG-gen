import java.util.Scanner;

class RGBBoxes {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int g = input.nextInt();
		int b = input.nextInt();
		int n = input.nextInt();
		int numberOfTriples = 0;
		for (int a = 0; a <= Math.ceil(n / r); a++)
		{
			for (int c = 0; c <= Math.ceil(n / g); c++)
			{
				for (int d = 0; d <= Math.ceil(n / b); d++)
				{
					if ((a*r) + (c * g) + (d * b) == n)
					{
						numberOfTriples++;
						d = (int) (Math.ceil(n/b) + 1);
					}
				}
			}
		}
		System.out.println(numberOfTriples);
	}
}
