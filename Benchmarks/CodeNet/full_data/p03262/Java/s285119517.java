import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int dif_local = 0;
		ArrayList<Integer> dif = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int city = sc.nextInt();
			dif.add(Math.abs(city - X));
		}
		Collections.sort(dif);
		int min = dif.get(0);

		System.out.println(min);
	}

}
