import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);

		String[] AB = sn.nextLine().split(" ");
		int A = Integer.parseInt(AB[0]);
		int B = Integer.parseInt(AB[1]);
		
		int x = ((B - A) / 2);
		
		int A1 = A - x;
		int A2 = A + x;
		int B1 = B - x;
		int B2 = B + x;

		if (A1 == B1) {
			System.out.println(A1);
			return;
		}
		if (A1 == B2) {
			System.out.println(A1);
			return;
		}
		if (A2 == B1) {
			System.out.println(A2);
			return;
		}
		if (A2 == B2) {
			System.out.println(A2);
			return;
		}

		System.out.println("IMPOSSIBLE");
	}
}