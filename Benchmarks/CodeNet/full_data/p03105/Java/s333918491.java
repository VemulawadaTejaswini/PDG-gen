import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		scn.useDelimiter(" ");
		while(scn.hasNext()) {
			list.add(scn.next());
			ArrayList<Integer> intlist = Main.chengeArray(list);
			if (Main.jage(intlist)) {
			int kaisuu = intlist.get(1) / intlist.get(0);
			int manzoku = intlist.get(0) * intlist.get(2);
			if (kaisuu >= intlist.get(2)) {
				System.out.print(intlist.get(2));
			} else {
				System.out.println(kaisuu);
			}
			} else {
				System.out.println(0);
			}
			break;
		}
	}
	public static ArrayList<Integer> chengeArray(ArrayList<String> list) {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			intlist.add(Integer.parseInt(list.get(i)));
		}
		return intlist;
	}

	public static boolean jage(ArrayList<Integer> arr) {
		if (arr.get(0) <= 1 || arr.get(0) >= 100) {

			return false;
		} else if (arr.get(1) <= 1 || arr.get(1) >= 100) {

			return false;
		} else if (arr.get(2) <= 1 || arr.get(2) >= 100) {

			return false;
		} else {

			return true;
		}
	}
}

