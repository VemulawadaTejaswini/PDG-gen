import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();

		String[] stringArray = str1.split(" ");

		long numberA = Long.parseLong(stringArray[0]);
		long numberB = Long.parseLong(stringArray[1]);

		long highNumber = Math.max(numberA, numberB);
		Long[] primeNumbers = sieveOfEratosthenes(highNumber);

		long resultCount = 1; // 1は絶対含まれる

		for (long primeNumber : primeNumbers) {

			if (numberA % primeNumber == 0 && numberB % primeNumber == 0) {
				resultCount++;
			}
		}

		System.out.println(resultCount);
	}

	public static Long[] sieveOfEratosthenes(long maxNumber) {

		List<Long> resultArray = new ArrayList<>();

		long[] targetArray = LongStream.range(2, maxNumber)
				.toArray();

		while (targetArray.length > 0) {

			long firstNumber = targetArray[0];

			resultArray.add(targetArray[0]);

			targetArray = Arrays.stream(targetArray)
					.filter(i -> i % firstNumber != 0)
					.toArray();
		}

		return resultArray.toArray(new Long[resultArray.size()]);
	}
}