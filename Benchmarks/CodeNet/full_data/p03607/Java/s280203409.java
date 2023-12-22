import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			if (list.contains(Ai)) {
				list.remove(new Integer(Ai));
			} else {
				list.add(Ai);
			}
		}
		sc.close();
		System.out.println(list.size());
	}
}