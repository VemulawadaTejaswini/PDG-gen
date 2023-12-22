import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int a1 = Integer.parseInt(tokens[0]);
		int a2 = Integer.parseInt(tokens[1]);
		int a3 = Integer.parseInt(tokens[2]);
		List<Integer> result = calcAllCost(a1, a2, a3);
		System.out.println(result.get(0));
		in.close();
	}

	private static List<Integer> calcAllCost(int a1, int a2, int a3) {
		List<Integer> result = new ArrayList<>();
		// a1->a2->a3
		result.add(Math.abs(a2 - a1) + Math.abs(a3 - a2));
		// a1->a3->a2
		result.add(Math.abs(a3 - a1) + Math.abs(a2 - a3));
		// a2->a1->a3
		result.add(Math.abs(a1 - a2) + Math.abs(a3 - a1));
		// a2->a3->a1
		result.add(Math.abs(a3 - a2) + Math.abs(a1 - a3));
		// a3->a1->a2
		result.add(Math.abs(a1 - a3) + Math.abs(a2 - a1));
		// a3->a2->a1
		result.add(Math.abs(a2 - a3) + Math.abs(a1 - a2));
		Collections.sort(result);
		return result;
	}

}