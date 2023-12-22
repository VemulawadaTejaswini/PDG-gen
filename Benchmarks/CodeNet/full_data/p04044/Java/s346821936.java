import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.next());
		}
		Collections.sort(list);
		sc.close();
		for(int i = 0; i < N; i++) {
			System.out.print(list.get(i));
		}
	}

}
