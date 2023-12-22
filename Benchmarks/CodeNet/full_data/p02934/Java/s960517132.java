import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += inverse(sc.nextInt());
		}
		System.out.println(inverse(sum));
	}
	
	static double inverse(double x) {
		return 1 / x;
	}
}
