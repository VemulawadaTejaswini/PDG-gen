import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> stList = new ArrayList<>();
		String result = "YES";
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (stList.contains(num)) {
				result = "NO";
				break;
			}
			stList.add(num);
		}
		sc.close();
		System.out.println(result);
	}
}