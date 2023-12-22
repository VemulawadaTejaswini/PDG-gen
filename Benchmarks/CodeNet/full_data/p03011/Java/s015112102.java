import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int q = scan.nextInt();
		int r = scan.nextInt();

		int[] a = {p, q, r};
		Arrays.sort(a);

		System.out.println(a[0] + a[1]);
	}
}
