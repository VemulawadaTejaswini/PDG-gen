import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A;
		int index;
//		int A[] = new int[N];
		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			A = sc.nextInt();
			index = array.indexOf(A);
			if (index == -1) {
				array.add(A);
			} else {
				array.remove(index);

			}
		}

		System.out.println(array.size());

	}
}
