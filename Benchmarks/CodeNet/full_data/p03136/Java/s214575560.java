import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N角形
		List<Integer> L = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			L.add(sc.nextInt());
		}
		Collections.sort(L, Comparator.reverseOrder());
		int index = 0;
		int max = L.get(0);
		int total = 0;
		for(int i = 1; i < L.size(); i++) {
			total += L.get(i);
		}
		if(max < total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}