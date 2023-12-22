import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		int[] values = new int[num];
		for (int i = 0; i < num; ++i) {
			values[i] = Integer.parseInt(tokens[i]);
		}
		for (int i = 0; i < num; ++i) {
			System.out.println(getMedium(i, values));
		}
		in.close();
	}

	public static int getMedium(int skipIndex, int[] values) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < values.length; ++i) {
			if (i != skipIndex) {
				list.add(values[i]);
			}
		}
		Collections.sort(list);
		int mediumIndex = (values.length / 2) - 1;
		return list.get(mediumIndex);
	}
}