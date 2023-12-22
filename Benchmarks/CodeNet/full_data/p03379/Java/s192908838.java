import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> X = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			X.add(sc.nextInt());
 		}
		
		for(int i = 0; i < N; i++) {
			List<Integer> Y = new ArrayList<>(X);
			Y.remove(i);
			Collections.sort(Y);
			System.out.println(Y.get(N / 2 - 1));
		}
	}
}
