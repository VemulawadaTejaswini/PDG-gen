import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nagasa = scan.nextInt();
		int n = scan.nextInt();
		int i = 0;
		String a = "";

		String[] ary = new String[nagasa];

		for (i = 0; i < nagasa; i++) {
			ary[i] = scan.next();
			//System.out.print(ary[i]);

		}

		Arrays.sort(ary);

		i = 0;

		for (i = 0; i < nagasa; i++) {
			a = a + ary[i];

			//System.out.println(a);

		}

		System.out.println(a);

	}

}