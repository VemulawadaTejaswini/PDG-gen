
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount_number = sc.nextInt();
		int count = 0;

		ArrayList<Integer> array_number = new ArrayList<>();
		for (int i =0; i < amount_number; i++) {
			int input_number = sc.nextInt();
			array_number.add(input_number);
		}

		Collections.sort(array_number);

		for (int i = 0; i < amount_number - 1; i++) {
			if (array_number.get(i) != array_number.get(i +1)) {
				count ++;
			}
			else {
				i++;
			}
		}
		System.out.println(count);
	}

}
