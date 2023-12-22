import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int n = scan.nextInt();
		int count = 0;

		ArrayList<Integer> list = new ArrayList<Integer>(n);

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());

			if(list.get(i) > k/2) {
				list.set(i , k - list.get(i));
			}
		}

		for(int i = 0;i < n;i++) {
			count += list.get(i);
		}

		System.out.println(count);
	}
}
