import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int count = 0;
		while(in.hasNextInt()) {
			a[count] = in.nextInt();
			count++;
		}
		in.close();
		Arrays.sort(a);
		System.out.println(a[0] + a[1]);
	}

}