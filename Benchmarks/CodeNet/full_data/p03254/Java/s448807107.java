import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] info = sc.nextLine().split(" ");
		Long num = Long.valueOf(info[1]);
		List<Integer> child = Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(Integer::valueOf)
				.sorted()
				.collect(Collectors.toList());
		Integer result = 0;
		for (Integer i : child) {
			num -= i;
			if (num >= 0)
				result++;
			else
				break;
		}
		System.out.println(num>0?result-1:result);
	}
}