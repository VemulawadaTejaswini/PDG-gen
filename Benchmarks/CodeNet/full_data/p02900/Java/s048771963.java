import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();

		String[] stringArray = str1.split(" ");

		int numberA = Integer.parseInt(stringArray[0]);
		int numberB = Integer.parseInt(stringArray[1]);

		int highNumber = Math.max(numberA, numberB);
		Integer[] primeNumbers = sieveOfEratosthenes(highNumber);

		int resultCount = 1; // 1は絶対含まれる

		for (int primeNumber : primeNumbers) {

			if (numberA % primeNumber == 0 && numberB % primeNumber == 0) {
				resultCount++;
			}
		}

		System.out.println(resultCount);
	}

	public static Integer[] sieveOfEratosthenes(int maxNumber) {

		List<Integer> resultArray = new ArrayList<>();

		int[] targetArray = IntStream.range(2, maxNumber)
				.toArray();

		while (targetArray.length > 0) {

			int firstNumber = targetArray[0];

			resultArray.add(targetArray[0]);

			targetArray = Arrays.stream(targetArray)
					.filter(i -> i % firstNumber != 0)
					.toArray();
		}

		return resultArray.toArray(new Integer[resultArray.size()]);
	}
}