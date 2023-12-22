import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();

		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		listA.add(1);
		listA.add(3);
		listA.add(5);
		listA.add(7);
		listA.add(8);
		listA.add(10);
		listA.add(12);

		listB.add(4);
		listB.add(6);
		listB.add(9);
		listB.add(11);

		if(listA.contains(x) && listA.contains(y)) {
			System.out.println("Yes");
		}else if(listB.contains(x) && listB.contains(y)) {
			System.out.println("Yes");
		}else if(x == 2 && y == 2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}