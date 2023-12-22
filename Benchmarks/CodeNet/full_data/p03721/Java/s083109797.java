import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long count = 0;
		int no = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		no = sc.nextInt();
		sc.nextLine();
		ArrayList<Long> list1 = new ArrayList<Long>();
		ArrayList<Long> list2 = new ArrayList<Long>();
		Long[] arrayLong = new Long[(int) count];
		for (long i = 0; i < count; i++) {
			long number = sc.nextLong();
			long numberCount = sc.nextLong();
			sc.nextLine();
			list1.add(number);
			list2.add(numberCount);
			arrayLong[(int) i] = number;
		}
		Arrays.sort(arrayLong);
		for (int j = 0; j < arrayLong.length; j++) {
			for (int i = 0; i < count; i++) {
				if (arrayLong[j] == list1.get(i)) {
					sum += list2.get(i);
				}
			}
			if (sum >= no) {
				System.out.println(arrayLong[j]);
				break;
			}
		}
		
		sc.close();
	}
}