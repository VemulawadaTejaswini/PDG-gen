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
		for (int i = 0; i < N; i++) {
			aList.add(sc.nextLong());
		}
		sc.close();

		List<Long> colorGroupMaxList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
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
