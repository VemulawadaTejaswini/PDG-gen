import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] t = new int[3];
		t[0] = Integer.parseInt(sc.next());
		t[1] = Integer.parseInt(sc.next());
		t[2] = Integer.parseInt(sc.next());
		sc.close();

		Arrays.sort(t);

		System.out.println(t[0] + t[1]);

	}

}
