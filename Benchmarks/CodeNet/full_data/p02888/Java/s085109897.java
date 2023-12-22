import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nString = sc.nextLine();
		List<Integer> list = Arrays.stream(sc.nextLine().split(" ")).map(Integer::valueOf).sorted()
				.collect(Collectors.toList());
		int size = list.size();
		int sizei = size - 2;
		int sizej = size - 1;
		long sum = 0;

		for (int i = 0; i < sizei; i++) {
			int li = list.get(i);
			for (int j = i + 1; j < sizej; j++) {
				int lj = list.get(j);
				int val = li + lj;
				for (int k = j + 1; k < size; k++) {
					int lk = list.get(k);
					if (val <= lk) {
						sum = sum + k - j-1;
						break;
					} else if (k == sizej) {
						sum = sum + k - j;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
