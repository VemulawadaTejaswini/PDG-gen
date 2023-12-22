import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int card = sc.nextInt();
		int gate = sc.nextInt();
		int count = 0;
		int flag = 0;
		ArrayList<Integer> array = new ArrayList<Integer>(10000);
		for (int i = 0; i < gate * 2; i++) {
			array.add(sc.nextInt());
		}
		for (int i = 1; i <= card; i++) {
			for (int j = 0; j < gate * 2; j += 2) {
				if (i >= array.get(j) && i <= array.get(j + 1)) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
			}

			if (flag == 1) {
				count++;
				flag=0;
			}
		}
		System.out.println(count);

	}
}
