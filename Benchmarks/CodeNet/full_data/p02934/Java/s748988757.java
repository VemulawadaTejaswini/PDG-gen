import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
		}
		double shita = 0;
		for (int i = 0; i < n; i++) {
			shita += 1 / a[i];
		}
		System.out.println(1 / shita);
	}
}
