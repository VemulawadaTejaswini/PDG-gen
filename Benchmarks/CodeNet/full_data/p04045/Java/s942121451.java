import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> d = new ArrayList<Integer>(k);

		for (int i = 0; i < k; i++) {
			d.add(sc.nextInt());
		}

		for (Integer i = n; i < 100000; i++) {
			int flag = 0;
			int len = String.valueOf(i).length();
			int dgt = (int)Math.pow(10,len-1);

			for (int j = 1; j <= len; j++) {
				if (d.contains(i/dgt)) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.print(i);
				break;
			}
		}

	}
}