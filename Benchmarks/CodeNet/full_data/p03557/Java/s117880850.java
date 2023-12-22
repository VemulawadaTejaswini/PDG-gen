import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> listA = new ArrayList<>(n);
		List<Integer> listB = new ArrayList<>(n);
		List<Integer> listC = new ArrayList<>(n);

		for(int i = 0; i < n; i++) {
			listA.add(sc.nextInt());
		}

		for(int i = 0; i < n; i++) {
			listB.add(sc.nextInt());
		}

		for(int i = 0; i < n; i++) {
			listC.add(sc.nextInt());
		}

		Collections.sort(listA);
		Collections.sort(listB);
		Collections.sort(listC);

		int[] b = new int[n];
		Arrays.fill(b, 0);

		int count;
		long sum = 0;
		for(int i = 0; i < n; i++) {
			count = 0;
			for(int j = n-1; j >= 0; j--) {
				if(listB.get(i) < listC.get(j)) {
					count++;
				} else {
					break;
				}
			}
			b[i] = count;
		}

		for(int i = 0; i < n; i++) {
			for(int j = n-1; j >= 0; j--) {
				if(listA.get(i) < listB.get(j)) {
					sum += b[j];
				} else {
					break;
				}
			}
		}

		System.out.println(sum);

	}
}