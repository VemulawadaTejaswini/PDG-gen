import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a[] = new int[2];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		Arrays.parallelSort(a);
		if (a[0]+W>=a[1]) {
			System.out.println(0);
			return ;
		}
		System.out.println(a[1]-a[0]-W);
		return ;
	}
}