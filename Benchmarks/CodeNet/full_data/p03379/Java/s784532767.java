import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] list = new int[a];
		int[] list2 = new int[a-1];
		int count = 0;
		int num = 0;

		for (int i = 0; i < a ; i++) {
			list[i] = scan.nextInt();
		}

		for (int i = 0; i < a ; i++) {
			for (int j = 0; j < a ; j++) {
				if (j != i) {
					list2[count] = list[j];
					count++;
				}
			}
			Arrays.sort(list2);
			num = list2.length/2;
			System.out.println(list2[num]);
			count = 0;
		}
		scan.close();
	}
}
