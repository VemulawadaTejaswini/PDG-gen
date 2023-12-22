import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> d = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			d.add(sc.nextInt());
		}
		Collections.sort(d);
		if(d.get(N/2 -1) == d.get(N/2)) {
			System.out.println(0);
		} else {
			System.out.println(d.get(N/2) - d.get(N/2 -1));
		}
	}
}