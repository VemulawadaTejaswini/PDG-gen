import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = scan.nextInt();
		int k = scan.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		int ans = 0;
		int index = list.size();
		list.sort(null);
		for (int i = 0; i < k; i++) {
			ans = ans + list.get(index - 1);
			index--;
		}
		System.out.println(ans);
	}

}