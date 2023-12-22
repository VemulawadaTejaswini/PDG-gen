import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);
		Integer n = Integer.valueOf(scanner.nextLine());
		String line = scanner.nextLine();
		
		Arrays.asList(line.split(" "))
			.forEach(it -> input.add(Integer.valueOf(it)));
		
		List<Integer> evenList = IntStream.rangeClosed(0, input.size() - 1)
			.filter(i -> i % 2 == 0)
			.map(i -> input.get(i))
			.boxed()
			.collect(Collectors.toList());
		
		List<Integer> oddList = IntStream.rangeClosed(0, input.size() - 1)
				.filter(i -> i % 2 == 1)
				.map(i -> Integer.valueOf(input.get(i)))
				.boxed()
				.collect(Collectors.toList());
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (n % 2 == 0) {
			Collections.reverse(oddList);
			result.addAll(oddList);
			result.addAll(evenList);
		} else {
			Collections.reverse(evenList);
			result.addAll(evenList);
			result.addAll(oddList);
		}
		result.forEach(it -> System.out.print(it.toString() + " "));
		System.out.println("");
	}
}