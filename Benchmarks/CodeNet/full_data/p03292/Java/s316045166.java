import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> n = new ArrayList<Integer>();
		n.add(sc.nextInt());
		n.add(sc.nextInt());
		n.add(sc.nextInt());
		Collections.sort(n);

		System.out.println(Math.abs(n.get(2)-n.get(1))+Math.abs(n.get(1)-n.get(0)));
		sc.close();
	}

}
