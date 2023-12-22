import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			b--;
			list.add(b);
		}
		
		List<Integer> ansList = new ArrayList<>();
		outer:
		for (int i = 0; i < n; i++) {
			for (int j = list.size() - 1; j >= 0; j--) {
				int num = list.get(j);
				if (j == num) {
					list.remove(j);
					ansList.add(num);
					continue outer;
				}
			}
			break;
		}
		
		if (list.isEmpty()) {
			Collections.reverse(ansList);
			for (int num : ansList) System.out.println(num + 1);
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}

