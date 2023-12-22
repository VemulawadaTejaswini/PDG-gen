import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		List<Integer> absList = new ArrayList<Integer>();
		absList.add(Math.abs(a1 - a2));
		absList.add(Math.abs(a2 - a3));
		absList.add(Math.abs(a3 - a1));
		Collections.sort(absList);

		System.out.println(absList.get(0) + absList.get(1));

		sc.close();
	}
}