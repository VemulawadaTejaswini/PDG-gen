import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c,d;

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < a; i++) {
			c = sc.nextInt();
			d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				list.add(c);
			}
		}

		Collections.sort(list);

		System.out.println(list.get(b-1));
	}

}
