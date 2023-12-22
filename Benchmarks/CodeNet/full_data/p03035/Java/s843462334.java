import java.util.*;

public class Main {

	static HashMap<Integer, ArrayList<Integer>> map;
	static boolean[] reached;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println((A >= 6 && A <= 12) ? B/2 : (A<=5 ? 0 : B));
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}