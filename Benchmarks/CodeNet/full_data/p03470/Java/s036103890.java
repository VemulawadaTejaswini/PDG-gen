import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			h.add(sc.nextInt());
		}
		System.out.println(h.size());
		sc.close();
	}
}