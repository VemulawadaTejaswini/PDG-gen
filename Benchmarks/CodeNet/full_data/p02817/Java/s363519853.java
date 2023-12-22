import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		String S,T;
		Scanner sc = new Scanner(System.in);

		S = sc.nextLine();
		T = sc.nextLine();
		sc.close();
		System.out.print(T+S);
	}
}