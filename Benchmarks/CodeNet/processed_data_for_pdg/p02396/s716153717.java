public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int x;
			for (int cnt = 1; (x = sc.nextInt()) != 0; cnt++) {
				System.out.println("Case " + cnt + ": " + x);
			}
		}
	}
}
