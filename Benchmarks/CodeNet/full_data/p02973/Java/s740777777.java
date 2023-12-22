import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 134
//E - Sequence Decomposing
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> aList = new ArrayList<>();

		boolean preAdded = true;
		long pre = 10000000000l;
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			if (a <= pre) {
				if (!preAdded) {
					aList.add(pre);
					aList.add(a);
				} else {
					aList.add(a);
				}
				pre = a;
				preAdded = true;
				continue;
			}
			pre = a;
			preAdded = false;
		}
		if (!preAdded) {
			aList.add(pre);
		}
		sc.close();

		List<Long> colorGroupMaxList = new ArrayList<>();
		for (int i = 0; i < aList.size(); i++) {
			long a = aList.get(i);
			boolean hasColor = false;
			for (int j = 0; j < colorGroupMaxList.size(); j++) {
				long max = colorGroupMaxList.get(j);
				if (max < a) {
					hasColor = true;
					colorGroupMaxList.set(j, a);
					break;
				}
			}
			if (!hasColor) {
				colorGroupMaxList.add(a);
			}
		}

		System.out.println(colorGroupMaxList.size());
	}
}
