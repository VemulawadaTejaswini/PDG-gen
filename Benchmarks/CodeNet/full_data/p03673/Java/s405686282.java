import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i=0; i<n; i++){
			b.add(a[i]);
			Collections.reverse(b);
		}
		System.out.println(b.toString().replace("[", "").replace("]", "").replace(",", ""));
	}

}
