import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int i = 0;
		for(i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int button = 0;
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		a:for(i = 0; button != 1; i = button) {
			button = a[i] - 1;
			for(int j = 0; j < list.size(); j++) {
				if(button == list.get(j)) {
					count = -1;
					break a;
				}
			}
			list.add(button);
			count++;
		}
		System.out.println(count);
	}
}