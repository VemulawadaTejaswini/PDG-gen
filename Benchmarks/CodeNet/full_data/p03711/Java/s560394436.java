import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(12);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(6);
		list2.add(9);
		list2.add(11);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (list.contains(x) && list.contains(y)) {
			System.out.println("Yes");
		} else if (list2.contains(x) && list2.contains(y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}