
import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int i = 0, j = 0, k = 0, flag;
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		if (i == j && i != k) {
			System.out.println("Yes");

		} else if (j == k && j != i) {
			System.out.println("Yes");

		} else if (k == i && k != j) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}
}
