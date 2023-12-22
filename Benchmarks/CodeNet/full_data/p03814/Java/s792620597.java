import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int count = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		String[] param = a.split("");
		for (int i = 0; i < a.length(); i++) {
			if (param[i].equals("A")) {
				for (int j = i; j < a.length() - i; j++) {
					count++;
					if (param[j].equals("Z")) {
						array.add(count);
					}
				}
			}
			count = 0;
		}
		Collections.sort(array);
		Collections.reverse(array);
		System.out.println(array.get(0));
	}
}