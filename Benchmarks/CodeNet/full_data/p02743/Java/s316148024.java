import java.util.*;
import java.math.*;

public class Main {
	public static void main(String ards[])
	{
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();

		if(c-2*(a+b) > 0) System.out.println("Yes");
		else System.out.println("No");
	}
}