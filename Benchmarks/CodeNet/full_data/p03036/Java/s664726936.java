import java.util.*;

public class Main {

	static HashMap<Integer, ArrayList<Integer>> map;
	static boolean[] reached;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int D = sc.nextInt();
		int x = sc.nextInt();

		int before = x;
		for(int i=1; i<=10; i++) {
			before = r*before-D;
			System.out.println(before);
		}
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}