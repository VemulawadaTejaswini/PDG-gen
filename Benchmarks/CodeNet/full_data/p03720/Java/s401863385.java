
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < m; i++) {
			list.add(sc.nextInt());
			list.add(sc.nextInt());
		}
		
		int[] road = new int[n];
		for (int i = 0; i < road.length; i++) {
			for (int r : list) {
				if (r == i + 1) {
					road[i]++;
				}
			}
			System.out.println(road[i]);
		}
	}
}