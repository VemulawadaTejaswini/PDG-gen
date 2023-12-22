import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		List<Integer> listA = new ArrayList<>();
		listA.add(1);
		listA.add(3);
		listA.add(5);
		listA.add(7);
		listA.add(8);
		listA.add(10);
		listA.add(12);
		List<Integer> listB = new ArrayList<>();
		listB.add(4);
		listB.add(6);
		listB.add(9);
		listB.add(11);
		List<Integer> listC = new ArrayList<>();
		listC.add(2);

		if (listA.contains(x) && listA.contains(y) || listB.contains(x) && listB.contains(y) || listC.contains(x) && listC.contains(y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}