
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> numbers = new ArrayList<Character>();


		int changes = scan.nextInt();
		scan.nextLine();
		String temp = scan.nextLine();

		for (int i = 0; i < temp.length(); i+=2) {
			numbers.add(temp.charAt(i));
		}

		while (changes > 0) {
			removeMin(numbers, numbers.size()/2);
			changes--;
			if (changes != 0) {
				removeMax(numbers, numbers.size()/2);
				changes--;
			}

		}

		System.out.println(cal(numbers));
	}

	public static void removeMin(ArrayList<Character> numbers, int end) {
		int min = (int) 10e9;
		int index = 0;
		for (int i = 0; i <= end; i++) {
			if (numbers.get(i) < min) {
				min = numbers.get(i);
				index = i;
			}
		}
		numbers.remove(index);
	}

	public static void removeMax(ArrayList<Character> numbers, int start) {
		int max = (int) -10e9;
		int index = 0;
		for (int i = start; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
				index = i;
			}
		}
		numbers.remove(index);

	}

	public static int cal(ArrayList<Character> numbers) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < numbers.size()/2; i++) {
			sum1 += numbers.get(i) - '0';
		}
		for (int i = numbers.size()/2; i < numbers.size(); i++) {
			sum2 += numbers.get(i) - '0';
		}

		return sum1 - sum2;
	}

}
