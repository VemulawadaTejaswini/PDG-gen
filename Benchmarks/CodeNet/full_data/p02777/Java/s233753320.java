import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double[] d = new double[50];

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] substr = str.split(" ", 0);

		String s0 = substr[0];
		String s1 = substr[1];

		str = scan.nextLine();
		substr = str.split(" ", 0);

		int n0 = Integer.parseInt(substr[0]);
		int n1 = Integer.parseInt(substr[1]);

		str = scan.nextLine();

		if (str.equals(s0)) {
			n0--;
		} else {
			n1--;
		}
		System.out.println(n0+" "+n1);
	}
}
