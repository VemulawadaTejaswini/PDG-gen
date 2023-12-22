import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		LinkedList<Double> list = new LinkedList<>();
		for ( int i = 0; i < n; i++ ) {
			list.add(in.nextDouble());
		}
		Collections.sort(list);

		while ( list.size() > 1 ) {
			double d0 = list.getFirst();
			list.removeFirst();
			double d1 = list.getFirst();
			list.removeFirst();

			list.addFirst((d0 + d1) / 2);
		}

		System.out.println(list.getFirst());
		in.close();
	}
}
