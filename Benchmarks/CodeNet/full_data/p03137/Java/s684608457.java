
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Scanner nLine = new Scanner(reader.nextLine());
		Scanner mLine = new Scanner(reader.nextLine());
		int n = nLine.nextInt();
		int l = nLine.nextInt();
		ArrayList<Integer> m = new ArrayList<Integer>();
		int result = 0;


		while (mLine.hasNextInt()) {
			int num = mLine.nextInt();
			m.add(num);
		}

		if (n > l) {
			System.out.print(result);
			reader.close();
			return;
		}

		Collections.sort(m);

		int smallest = m.get(0);
		int largest = m.get(m.size()-1);

		float target = Math.abs(((float) largest + (float)smallest) / n);

		ArrayList<Integer> starts = new ArrayList<Integer>();

		for (int j = 1; j < n; j++) {
			starts.add(getIndexOfNearestValue(m.subList(1, m.size()), smallest + target * (float)j));
		}

		if (starts.get(0) > 1) {
			result = result + Math.abs(m.get(starts.get(0) - 1) - m.get(0));
		}
		for (int g = 0; g < starts.size()-2; g++) {
			if ((starts.get(g+1) - starts.get(g)) > 1) {
				result = result + Math.abs(m.get(starts.get(g)) - m.get(starts.get(g+1)-1));
			}
		}

		if (starts.size() != m.size()) {
			result = result + Math.abs(m.get(starts.get(starts.size()-1)) - largest);
		}

		System.out.print(result);
		reader.close();
	}

	public static int getIndexOfNearestValue(List<Integer> list, float target) {
		int index = 0;
		float minv = Math.abs(target - (float)list.get(0));

		for (int i = 0; i < list.size(); i++) {
			float v = Math.abs(target - (float)list.get(i));
			if (v < minv) {
				index = i;
				minv = v;
			}
		}
		return index + 1;
	}


}
