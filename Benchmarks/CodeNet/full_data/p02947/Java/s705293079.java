import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		List<String> list = new ArrayList<>();
		while (sc.hasNext()) {
			char[] array = sc.nextLine().toCharArray();
			Arrays.sort(array);
			list.add(String.valueOf(array));
		}

		// 全探索
		int size = list.size();
		int count = 0;
		for (int i = 0; i < size - 1; i++) {
			String a = list.get(i);
			for (int j = i + 1; j < size; j++) {
				if (a.equals(list.get(j))) {
					count++;
				}
				;
			}
		}
		System.out.println(count);
	}
}
