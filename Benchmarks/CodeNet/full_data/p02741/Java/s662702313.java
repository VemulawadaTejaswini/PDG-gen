import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		var l = new ArrayList<Integer> (Arrays.asList(1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51));
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int k = scan.nextInt();
		System.out.println(l.get(k-1));
		scan.close();
	}
}