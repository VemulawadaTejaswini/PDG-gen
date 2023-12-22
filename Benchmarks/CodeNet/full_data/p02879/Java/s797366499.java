
public class Main {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		if (n1 > 9 || n2 > 9) {
			System.out.print("-1");
		} else {
			System.out.print(n1 * n2);
		}
	}
}
