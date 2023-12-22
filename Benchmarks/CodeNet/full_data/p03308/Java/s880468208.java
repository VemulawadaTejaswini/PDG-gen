import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		LinkedList<Integer> A = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			A.add(a);
		}

		Collections.sort(A);

		System.out.println(A.getLast() - A.getFirst());
	}
}