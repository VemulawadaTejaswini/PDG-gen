import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int count = Integer.parseInt(in);
		String inLine = sc.nextLine();
		String[] inArray = inLine.split(" ");
		int[] intArray1 = new int[count];
		int[] intArray2 = new int[count];

		List<Integer> lines = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			intArray1[i] = Integer.parseInt(inArray[i]);
		}
		intArray2 = intArray1.clone();
		for (int i = 0 ; i < count; i++) {
			for (int j = 0; j < count;j++) {
				if (intArray1[i] == intArray2[j] && i != j) {
					Integer n1 = new Integer(intArray1[i]);
					if (!lines.contains(n1)) {
						lines.add(n1);
					}
					break;
				}
			}
		}
		if (lines.size() < 1){
			System.out.println(0);
		} else {
			Collections.sort(lines);
			if (lines.size() == 1) {
				int n1 = lines.get(lines.size()-1).intValue();
				System.out.println(n1 * n1);
			} else {
				int n1 = lines.get(lines.size()-1).intValue();
				int n2 = lines.get(lines.size()-2).intValue();
				System.out.println(n1 * n2);
			}
		}

	}


}