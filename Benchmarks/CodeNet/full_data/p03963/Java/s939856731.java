import java.util.Scanner;

/**
 * Created by Taichi1 on 10/22/16.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int i = 1;
		int count = k;
		while (i < n) {
			count *= (k - 1);
			i++;
		}
		System.out.println(count);
	}
}
