import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> X = new ArrayList<Integer>();
		for (int i = 0; i < N; i++)
			X.add(sc.nextInt());
		sc.close();

		for (int i = 0; i < N; i++) {
			ArrayList<Integer> xCopy = (ArrayList<Integer>)X.clone();
			xCopy.remove(i);
			Collections.sort(xCopy);
			System.out.println(xCopy.get((N - 1) / 2));
		}
	}
}