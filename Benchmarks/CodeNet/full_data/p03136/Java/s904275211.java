import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> LL = new ArrayList<>();
		
		int N = sc.nextInt();
		String L = sc.nextLine();
		String[] Ln = L.split(" ");
		
		for (int i = 0; i < N; i++) {
			LL.add(Integer.parseInt(Ln[i]));
		}
		
		Collections.sort(LL, Collections.reverseOrder());
		
		int total = 0;
		int max = LL.get(0);
		
		for (int m = 1; m < N; m++) {
			total += LL.get(m);
		}
		
		if (max < total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		}
}