import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				al.add(Integer.parseInt(sc.next()));
			} else {
				al.add(0, Integer.parseInt(sc.next()));
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(al.get(i).toString());
			if (i != n - 1) {
				System.out.print(" ");
			}
		}

		sc.close();

	}

}