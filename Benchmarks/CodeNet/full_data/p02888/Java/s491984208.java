import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> rod = new ArrayList<>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			rod.add(sc.nextInt());
		}

		Collections.sort(rod);

		int sum = 0;

		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					if(rod.get(k) >= rod.get(i) + rod.get(j)) {
						continue;
					}
					sum++;
				}
			}
		}
		
		for(int value : rod) {
			System.out.print(value + " ");
		}

		System.out.println(sum);
		sc.close();
	}
}
