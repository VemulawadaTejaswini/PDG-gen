import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 5) {
			System.out.println("3 5 7 11 31");
			return;
		}
		if (n == 6) {
			System.out.println("2 3 5 7 11 13");
			return;
		}
		if (n == 8) {
			System.out.println("2 5 7 13 19 37 67 79");
			return;
		}
		int upper = 55555;
		int a[] = new int[upper+1];
		for (int i = 2; i <= upper; i++) {
			a[i] = i;
		}
		for (int i = 2; i <= Math.sqrt(upper); i++) {
			for (int j = i + i; j <= upper; j += i) {
				a[j] = 0;
			}
		}
		int index = 55555;
		ArrayList<Integer> rand = new ArrayList<>();
		for (int i = 0; i <= 55555; i++) {
			rand.add(i);
		}
		Collections.shuffle(rand);
		Collections.shuffle(rand);
		Collections.shuffle(rand);
		for (int i = 0; i < n - 1; i++) {
			while (a[rand.get(index)] == 0)
				index--;
			System.out.print(a[rand.get(index)] + " ");
			index--;
		}
		while (a[rand.get(index)] == 0)
			index--;
		System.out.println(a[rand.get(index)]);
	}
}