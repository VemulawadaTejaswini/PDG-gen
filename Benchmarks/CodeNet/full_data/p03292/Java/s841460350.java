import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();
		int ans = 0;

		int [] list = new int [] {A1, A2, A3};
		Arrays.sort(list);

		ans = (list[1] - list[0]) + (list[2] - list[1]) ;
		System.out.println( ans );
	}
}